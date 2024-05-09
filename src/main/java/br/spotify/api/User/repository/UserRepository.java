package br.spotify.api.User.repository;

import br.spotify.api.User.model.UserSpotify;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserSpotify, Long> {

}