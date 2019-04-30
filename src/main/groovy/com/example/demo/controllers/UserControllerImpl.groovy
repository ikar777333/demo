package com.example.demo.controllers

import com.example.demo.entities.UserDTO
import com.example.demo.repositories.UserRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserControllerImpl{

    UserRepository userRepository

    @GetMapping("/user")
    UserDTO getUserById(Integer id) {
        return new UserDTO(id: 1L, name: "User")
    }

    @PutMapping("/user")
    UserDTO addUser() {
        return null
    }

    @PostMapping("/user")
    UserDTO modifyUserById(Integer id) {
        return null
    }

    @DeleteMapping("/user")
    void deleteUserById(Integer id) {

    }
}
