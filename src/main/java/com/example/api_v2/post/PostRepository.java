package com.example.api_v2.post;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    private List<Post> findAllPostByUserId(Integer userId) {
        return null;
    }

    void findAllPostByUserId();
}
