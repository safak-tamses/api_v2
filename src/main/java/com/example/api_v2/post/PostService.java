package com.example.api_v2.post;

import com.example.api_v2.user.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PostService {
    private PostRepository postRepository;
    private UserRepository userRepository;

    public Optional<Post> getPostById(Integer id, Integer postId) {
        if (userCheck(id))
            return postRepository.findById(postId);
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

    private boolean userCheck(Integer userId) {
        userRepository.findById(userId);
        return true;
    }
}
