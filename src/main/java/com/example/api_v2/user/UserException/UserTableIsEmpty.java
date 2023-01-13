package com.example.api_v2.user.UserException;

public class UserTableIsEmpty extends Exception {
    public UserTableIsEmpty(String s) {
        super("User table is empty...");
    }
}
