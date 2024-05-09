package br.spotify.api.Playlists.repository;

import br.spotify.api.Playlists.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
