package com.nnirmall.user_service.service;

import com.nnirmall.user_service.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.UUID;

public interface UserService {

    public User createUser(User user);

    public User updateUser(User user, Integer id);
    public User getUserById(Integer id);
    public List<User> getAllUser();
    public boolean deleteUser(Integer id);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
