package br.spotify.api.Services.Playlists.service;

import br.spotify.api.Services.Playlists.model.Playlist;

import java.util.List;

public interface PlaylistService {
    public List<Playlist> getPlaylists();
    public List<Playlist> getPlaylistById(Long id);
    public void addPlaylist(Playlist playlist);
    public void deletePlaylist(Long id);
}
