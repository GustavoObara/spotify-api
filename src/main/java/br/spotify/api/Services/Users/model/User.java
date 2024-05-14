package br.spotify.api.Services.Users.model;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.*;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotNull
    private String id_user;

    @NotBlank(message = "O nome não pode estar em branco")
    @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres")
    private String display_name;

    @NotNull
    private String spotify;

    @NotNull
    private String href;

    @NotNull
    private String image_url;

    @NotNull
    private String image_height;

    @NotNull
    private int image_weight;

    @NotNull
    private String type;

    @NotNull
    private String uri;

    @NotNull
    private String followers_href;

    @NotNull
    private int followers_total;
}