package br.spotify.api.Services.Track.repository;

import br.spotify.api.Services.Playlists.model.Playlist;
import br.spotify.api.Services.Track.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track, Long> {
}
