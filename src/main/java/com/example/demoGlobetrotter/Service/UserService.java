package com.example.demoGlobetrotter.Service;

import com.example.demoGlobetrotter.Entity.User;
import com.example.demoGlobetrotter.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register user with an invite code
    public User registerUser(String username) {
        User existingUser = userRepository.findByUsername(username);
        if (existingUser != null) {
            return existingUser; // User already exists
        }

        User newUser = new User();
        newUser.setUsername(username);
        newUser.setInviteCode(generateInviteCode());
        return userRepository.save(newUser);
    }

    // Find user by invite code
    public Optional<User> getUserByInviteCode(String inviteCode) {
        return Optional.ofNullable(userRepository.findByInviteCode(inviteCode));
    }

    // Generate a unique invite code
    private String generateInviteCode() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
