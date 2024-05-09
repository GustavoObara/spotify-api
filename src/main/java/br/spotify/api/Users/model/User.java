package br.spotify.api.Users.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   idUser;
    private String name;
    private String imageUrl;
    private int    likedSongs;
    private int    followedArtists;
    private int    followers;
    private int    playlists;
}