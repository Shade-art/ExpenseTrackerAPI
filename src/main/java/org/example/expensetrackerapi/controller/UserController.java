package org.example.expensetrackerapi.controller;

import jakarta.validation.Valid;
import org.example.expensetrackerapi.DTO.CreateUserRequestDTO;
import org.example.expensetrackerapi.Services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}
