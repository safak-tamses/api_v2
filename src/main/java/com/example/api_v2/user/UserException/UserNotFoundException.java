package com.example.api_v2.user.UserException;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String s){
        super("User not found..");
    }
}
