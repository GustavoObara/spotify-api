package br.spotify.api.Services.Playlists.service;

import br.spotify.api.Services.Playlists.model.Playlist;
import br.spotify.api.Services.Playlists.repository.PlaylistRepository;
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
