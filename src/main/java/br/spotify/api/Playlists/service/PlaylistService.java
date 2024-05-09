package br.spotify.api.Playlists.service;

import br.spotify.api.Playlists.model.Playlist;
import br.spotify.api.Users.model.User;

import java.util.List;

public interface PlaylistService {
    public List<Playlist> getPlaylists();
    public List<Playlist> getPlaylistById(Long id);
    public void addPlaylist(Playlist playlist);
    public void deletePlaylist(Long id);
}
