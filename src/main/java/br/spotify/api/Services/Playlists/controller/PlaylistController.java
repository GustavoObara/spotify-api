package br.spotify.api.Services.Playlists.controller;

import br.spotify.api.Services.Playlists.model.Playlist;
import br.spotify.api.Services.Playlists.service.PlaylistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist")
@RequiredArgsConstructor
public class PlaylistController {

    private final PlaylistService playlistService;

    @GetMapping("/all")
    public List<Playlist> getPlaylists(){
        return playlistService.getPlaylists();
    }

    @GetMapping("/{id}")
    public List<Playlist> getPlaylist(@PathVariable Long id){
        return playlistService.getPlaylistById(id);
    }

    @PostMapping("/add")
    public void addPlaylist(@RequestBody Playlist playlist){
        playlistService.addPlaylist(playlist);
    }

    @DeleteMapping("/remove/{id}")
    public void deletePlaylist(@PathVariable Long id){
        playlistService.deletePlaylist(id);
    }

}
