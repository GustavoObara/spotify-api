package br.spotify.api.Services.Users.repository;

import br.spotify.api.Services.Users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {}