package com.example.demoGlobetrotter.Controller;

import com.example.demoGlobetrotter.Entity.User;
import com.example.demoGlobetrotter.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // Register a new user & return invite link
    @PostMapping("/register")
    public String registerUser(@RequestParam String username) {
        User user = userService.registerUser(username);
        return "Invite Link: http://localhost:8080/game?invite=" + user.getInviteCode();
    }

    // Fetch inviter’s score for invited user
    @GetMapping("/invite/{code}")
    public String getInviterScore(@PathVariable String code) {
        Optional<User> user = userService.getUserByInviteCode(code);
        return user.map(value -> "Inviter's Score: " + value.getScore())
                .orElse("Invalid invite code");
    }
}
