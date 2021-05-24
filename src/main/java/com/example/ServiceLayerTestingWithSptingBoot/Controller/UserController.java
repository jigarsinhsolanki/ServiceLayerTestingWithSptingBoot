package com.example.ServiceLayerTestingWithSptingBoot.Controller;

import com.example.ServiceLayerTestingWithSptingBoot.Entity.User;
import com.example.ServiceLayerTestingWithSptingBoot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUserData")
    public User addUserData(@RequestBody User user){

        return userService.saveUser(user);
    }
    @GetMapping("/getUserData/{id}")
    public User getUserData(@PathVariable int id){

        return userService.getUserData(id);
    }

    @PutMapping("/updateUserData/{id}")
    public User updateUserData(@RequestBody User user){

        return userService.updateUserData(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){

        return userService.deleteUser(id);

    }
}
