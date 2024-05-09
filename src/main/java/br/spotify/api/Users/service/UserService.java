package br.spotify.api.Users.service;

import br.spotify.api.Users.model.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();
    public List<User> getUserById(Long id);
    public void addUser(User user);
    public void deleteUser(Long id);
}
