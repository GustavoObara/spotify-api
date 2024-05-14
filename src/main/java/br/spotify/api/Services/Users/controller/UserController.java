package br.spotify.api.Services.Users.controller;

import br.spotify.api.Services.Users.model.User;
import br.spotify.api.Services.Users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/all")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public List<User> getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
