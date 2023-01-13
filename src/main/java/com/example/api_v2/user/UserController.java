package com.example.api_v2.user;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    UserService userService;

    @GetMapping("/{userId}")
    public Optional<User> getUserWithId(@PathVariable Integer userId) {
        return userService.getUserWithId(userId);
    }

    @GetMapping("/all")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
    @PutMapping("/{userId}")
    public ResponseEntity<String>fixUser(@PathVariable Integer userId, @RequestBody User user) throws Exception {
        return ResponseEntity.ok(userService.fixUser(userId,user));
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<String>deleteUser(@PathVariable Integer userId) throws Exception{
        return ResponseEntity.ok(userService.deleteUser(userId));
    }

}
