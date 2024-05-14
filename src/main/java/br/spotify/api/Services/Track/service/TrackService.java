package br.spotify.api.Services.Track.service;

import br.spotify.api.Services.Track.model.Track;

import java.util.List;

public interface TrackService {
    public List<Track> getTracks();
    public List<Track> getTrackById(Long id);
    public void addTrack(Track track);
    public void deleteTrack(Long id);
}
