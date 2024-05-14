package br.spotify.api.Services.Playlists.repository;

import br.spotify.api.Services.Playlists.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
