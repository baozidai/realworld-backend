package me.baozidai.realworld.controller;

import me.baozidai.realworld.model.RealworldUsers;
import me.baozidai.realworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public RealworldUsers register(@RequestBody RealworldUsers user) {
        return userService.register(user.getUsername(), user.getEmail(), user.getPassword());
    }

    @PostMapping("/login")
    public RealworldUsers login(@RequestBody RealworldUsers user) {
        return userService.login(user.getUsername(), user.getPassword());
    }

    @GetMapping("/{username}")
    public RealworldUsers getUserByUsername(@PathVariable String username) {
        return userService.getUsersByUsername(username);
    }

    @GetMapping("/profile/{username}")
    public RealworldUsers getUserProfile(@PathVariable String username) {
        return userService.getUsersProfile(username);
    }
}
