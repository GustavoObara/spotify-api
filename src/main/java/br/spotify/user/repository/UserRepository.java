package br.spotify.user.repository;

import br.spotify.user.model.UserSpotify;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserSpotify, Long> {

}