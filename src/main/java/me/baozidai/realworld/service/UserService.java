package me.baozidai.realworld.service;

import me.baozidai.realworld.model.RealworldUsers;

public interface UserService {

    public RealworldUsers register(String username, String email, String password);
    public RealworldUsers login(String username, String password);
    public RealworldUsers getUsersByUsername(String username);
    public RealworldUsers getUsersProfile(String username);

    
}
