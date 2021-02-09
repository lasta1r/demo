package ru.croc.springex.demo.service.impl;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.croc.springex.demo.model.User;
import ru.croc.springex.demo.service.UserService;

import java.util.List;
import java.util.UUID;

@Service
@Profile("test")
public class UserServiceImpl2 implements UserService {
    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUser(UUID id) {
        return null;
    }

    @Override
    public void deleteUser(UUID id) {

    }
}
