package br.spotify.api.Playlists.service;

import br.spotify.api.Playlists.model.Playlist;
import br.spotify.api.Playlists.repository.PlaylistRepository;
import br.spotify.api.Users.model.User;
import br.spotify.api.Users.repository.UserRepository;
import br.spotify.api.Users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaylistServiceImpl implements PlaylistService {
    private final PlaylistRepository playlistRepository;

    @Override
    public List<Playlist> getPlaylists() {
        return playlistRepository.findAll();
    }

    @Override
    public List<Playlist> getPlaylistById(Long id) {
        return playlistRepository.findAllById(Collections.singleton(id));
    }

    @Override
    public void addPlaylist(Playlist playlist) {
        playlistRepository.save(playlist);
    }

    @Override
    public void deletePlaylist(Long id) {
        playlistRepository.deleteById(id);
    }
}
