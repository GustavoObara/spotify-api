package br.spotify.user.controller;

import br.spotify.user.model.UserSpotify;
import br.spotify.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/all")
    public List<UserSpotify> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public List<UserSpotify> getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/add")
    public void addUser(@RequestBody UserSpotify userSpotify){
        userService.addUser(userSpotify);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

}
