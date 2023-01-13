package com.example.api_v2.post.Exceptions;

public class PostNotFoundException extends Exception{
    public PostNotFoundException(){
        super("Post not found...");
    }
}
