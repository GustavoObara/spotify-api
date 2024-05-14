package br.spotify.api.Services.Playlists.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "playlist")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playlist_id;

    @NotBlank(message = "O nome não pode estar em branco")
    @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres")
    private String name;

    @NotNull
    private String image_url;
    private Integer image_height;
    private Integer image_weight;

    @NotNull
    private String uri;

    private Long track_id;
    private Integer followers_total;
}