package com.example.api_v2.post;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    default List<Post> findAllPostByUserId(Integer userId, Integer postId) {
        return null;
    }

}
