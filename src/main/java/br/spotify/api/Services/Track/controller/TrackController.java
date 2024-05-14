package br.spotify.api.Services.Track.controller;

import br.spotify.api.Services.Track.model.Track;
import br.spotify.api.Services.Track.service.TrackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/track")
@RequiredArgsConstructor
public class TrackController {
    private final TrackService trackService;

    @GetMapping("/all")
    public List<Track> getTracks(){
        return trackService.getTracks();
    }

    @GetMapping("/{id}")
    public List<Track> getTrack(@PathVariable Long id){
        return trackService.getTrackById(id);
    }

    @PostMapping("/add")
    public void addTrack(@RequestBody Track track){
        trackService.addTrack(track);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteTrack(@PathVariable Long id){
        trackService.deleteTrack(id);
    }

}
