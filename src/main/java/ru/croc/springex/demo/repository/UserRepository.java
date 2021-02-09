package ru.croc.springex.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.croc.springex.demo.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

    List<User> findAll();

    Optional<User> findById(UUID id);

    User findAllById(UUID id);

    User findFirstByNameAndLastNameOrderByIdAsc(String name, String lastName);

}
