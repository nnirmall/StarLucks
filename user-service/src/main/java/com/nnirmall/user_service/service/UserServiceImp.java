package com.nnirmall.user_service.service;

import com.nnirmall.user_service.entity.User;
import com.nnirmall.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
//        user.setId(UUID.randomUUID());
        user.setCreatedAt(Instant.now());
//        user.setRoles("USER"]);
        user.setUpdatedAt(Instant.now());
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, Integer id) {

        User existingUser = userRepository.findById(id).orElse(null);
        if(existingUser != null){
            existingUser.setUsername(user.getUsername());
            existingUser.setEmail(user.getEmail());
            existingUser.setFirstName(user.getFirstName());
            existingUser.setLastName(user.getLastName());
            existingUser.setPhoneNumber(user.getPhoneNumber());
            existingUser.setRoles(user.getRoles());
            existingUser.setAddress(user.getAddress());
//            existingUser.setCreatedAt(user.getCreatedAt());
            existingUser.setUpdatedAt(Instant.now());
            return userRepository.save(existingUser);
        }
        else {
            return null;
        }
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);

    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteUser(Integer id) {
        User existingUser = userRepository.findById(id).orElse(null);
        if(existingUser != null){
            userRepository.delete(existingUser);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Optional<User> user = userRepository.findByUsername(username);

        org.springframework.security.core.userdetails.User.UserBuilder builder = null;
        if(user.isPresent()){
            User currentUser = user.get();
            builder = org.springframework.security.core.userdetails.
                    User.withUsername(username);
            builder.password(currentUser.getPasswordHash());
//            builder.roles(currentUser.getRoles());
        } else {
            throw new UsernameNotFoundException("User not found.");
        }
        return builder.build();
    }
}
