package com.example.api_v2.user;

import com.example.api_v2.user.UserException.UserNotFoundException;
import com.example.api_v2.user.UserException.UserTableIsEmpty;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class UserService {
    UserRepository userRepository;

    public Optional<User> getUserWithId(Integer userId) {
        return Optional.ofNullable(userRepository.findById(userId)
                .orElseThrow(() ->
                        new UsernameNotFoundException("")));
    }

    public List<User> getAllUser() {
        if (userRepository.findAll().isEmpty())
            return (List<User>) new UserTableIsEmpty("");
        else return userRepository.findAll();
    }

    public String fixUser(Integer userId, User user) throws Exception {
        Optional<User> tempUser = userRepository.findById(userId);
        if (tempUser.isPresent()) {
            User u = tempUser.get();
            u.setEmail(user.getEmail());
            u.setFirstname(user.getFirstname());
            u.setLastname(user.getLastname());
            // TODO: 13.01.2023  //password change
            return "User fixed successfully..";
        } else throw new Exception("User not found");
    }

    public String deleteUser(Integer userId) {
        try {
            userRepository.deleteById(userId);
            return "User deleted successfully..";
        } catch (Exception e) {
            return "User  not deleted..";
        }
    }
}
