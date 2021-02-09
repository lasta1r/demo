package ru.croc.springex.demo.service.impl;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.croc.springex.demo.model.User;
import ru.croc.springex.demo.repository.UserRepository;
import ru.croc.springex.demo.service.UserService;

import java.util.List;
import java.util.UUID;

@Service
@Primary
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Value(value = "${custom.my-property}")
    private String property;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAllUsers() {
        System.out.println(property);
        return repository.findAll();
    }

    @Override
    public User getUser(UUID id) {
        return repository.findAllById(id);
    }

    @Override
    public void deleteUser(UUID id) {
        repository.deleteById(id);
    }
}
