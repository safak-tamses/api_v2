package com.example.api_v2.post;

import com.example.api_v2.post.Exceptions.PostNotFoundException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PostService {
    private PostRepository postRepository;
    public Post getPostById(Integer id, Integer postId){
        postRepository.findAllPostByUserId(id);
        return null;
    }


    public List<Post> getAllForUser(Integer userId) {
        return null;
    }

    public List<Post> showAll() {
        return null;
    }

    public void createPost(Integer userId, Post post) {
    }

    public void fixPost(Integer userId, Integer postId, Post post) {

    }

    public void deleteOnePostForUser(Integer userId, Integer postId) {
    }

    public void deleteAllPostsForUser() {
    }

    public void deleteAllPostsForAllUser() {
    }
}
