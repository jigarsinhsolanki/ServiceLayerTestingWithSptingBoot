package com.example.ServiceLayerTestingWithSptingBoot.Service;

import com.example.ServiceLayerTestingWithSptingBoot.Entity.User;
import com.example.ServiceLayerTestingWithSptingBoot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User saveUser(User user) {

        return userRepository.save(user);
    }

    public User getUserData(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUserData(User user) {

        User existingUser=userRepository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());
        existingUser.setAddress(user.getAddress());
        return userRepository.save(existingUser);
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "Selected user is deleted!!" +id;
    }
}
