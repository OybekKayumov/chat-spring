package org.example.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//public interface UserRepository extends CrudRepository<User, Integer> {
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findBySessionId(String sessionId);

}
