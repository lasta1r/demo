package ru.croc.springex.demo.service;

import ru.croc.springex.demo.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<User> getAllUsers();

    User getUser(UUID id);

    void deleteUser(UUID id);
}
