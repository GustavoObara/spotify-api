package br.spotify.user.service;

import br.spotify.user.model.UserSpotify;

import java.util.List;

public interface UserService {
    public List<UserSpotify> getUsers();
    public List<UserSpotify> getUserById(Long id);
    public void addUser(UserSpotify userSpotify);
    public void deleteUser(Long id);
}
