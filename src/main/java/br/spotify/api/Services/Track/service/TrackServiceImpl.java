package br.spotify.api.Services.Track.service;

import br.spotify.api.Services.Track.model.Track;
import br.spotify.api.Services.Track.repository.TrackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TrackServiceImpl implements TrackService {
    private final TrackRepository trackRepository;

    @Override
    public List<Track> getTracks() {
        return trackRepository.findAll();
    }

    @Override
    public List<Track> getTrackById(Long id) {
        return trackRepository.findAllById(Collections.singleton(id));
    }

    @Override
    public void addTrack(Track track) {
        trackRepository.save(track);
    }

    @Override
    public void deleteTrack(Long id) {
        trackRepository.deleteById(id);
    }
}
