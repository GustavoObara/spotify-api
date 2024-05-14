package br.spotify.api.Services.Users.service;

import br.spotify.api.Services.Users.model.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();
    public List<User> getUserById(Long id);
    public void addUser(User user);
    public void deleteUser(Long id);
}
