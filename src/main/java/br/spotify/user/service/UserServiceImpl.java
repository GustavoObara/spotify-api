package br.spotify.user.service;

import br.spotify.user.model.UserSpotify;
import br.spotify.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserSpotify> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<UserSpotify> getUserById(Long id) {
        return userRepository.findAllById(Collections.singleton(id));
    }

    @Override
    public void addUser(UserSpotify userSpotify) {
        userRepository.save(userSpotify);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
