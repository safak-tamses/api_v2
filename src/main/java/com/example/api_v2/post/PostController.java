package com.example.api_v2.post;

import com.example.api_v2.post.Exceptions.PostNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    public PostService service;

    @GetMapping("/{userId}/{postId}")
    public Optional<Post> showPostsForUser(@PathVariable Integer userId, @PathVariable Integer postId) throws PostNotFoundException {
        return service.getPostById(userId, postId);
    }

    @GetMapping("/{userId}/all")
    public List<Post> showAllPostForUser(@PathVariable Integer userId) {
        return service.getAllForUser(userId);
    }

    @GetMapping("/all")
    public List<Post> showAllPostForAllUser() {
        return service.showAll();
    }

    @PostMapping("/{userId}")
    public ResponseEntity<String> createPost(@PathVariable Integer userId, @RequestBody Post post) {
        try {
            service.createPost(userId, post);
            return ResponseEntity.ok("Create successful.");
        } catch (Exception e) {
            return ResponseEntity.ok("olmadı aga");
        }
    }

    @PutMapping("/{userId}/{postId}")
    public ResponseEntity<String> fixPost(@PathVariable Integer userId, @PathVariable Integer postId, @RequestBody Post post) {
        try {
            service.fixPost(userId, postId, post);
            return ResponseEntity.ok("Post fixed successfully");
        } catch (Exception e) {
            return ResponseEntity.ok("olmadı aga");
        }
    }

    @DeleteMapping("/{userId}/{postId}")
    public ResponseEntity<String> deleteOnePostForUser(@PathVariable Integer userId, @PathVariable Integer postId) {
        try {
            service.deleteOnePostForUser(userId, postId);
            return ResponseEntity.ok("Post deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.ok("olmadı aga");
        }
    }

    @DeleteMapping("/{userId}/deleteAllPosts")
    public ResponseEntity<String> deleteAllPostsForUser(@PathVariable Integer userId) {
        try {
            service.deleteAllPostsForUser();
            return ResponseEntity.ok(userId + "all posts deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.ok("olmadı aga");
        }
    }

    @DeleteMapping("/deleteAllPosts")
    public ResponseEntity<String> deleteAllPostsForAllUser() {
        try {
            service.deleteAllPostsForAllUser();
            return ResponseEntity.ok("All posts deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.ok("olmadı aga");
        }
    }


}
