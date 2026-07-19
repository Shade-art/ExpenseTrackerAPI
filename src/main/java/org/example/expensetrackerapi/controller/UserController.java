package org.example.expensetrackerapi.controller;

import jakarta.validation.Valid;
import org.example.expensetrackerapi.DTO.CreateUserRequestDTO;
import org.example.expensetrackerapi.DTO.UsersNamesDTO;
import org.example.expensetrackerapi.Services.UserService;
import org.example.expensetrackerapi.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
        private final UserService userService;
        UserController(UserService userService){
            this.userService = userService;
        }

        @PostMapping("/users")
        public String savesUser(@Valid @RequestBody CreateUserRequestDTO user)
        {
            userService.saveUser(user);
            return "User Saved Successfully";
        }

        @GetMapping("/users")
    public List<UsersNamesDTO> getAllUsers()
        {
            return userService.getAllUser();
        }



}
