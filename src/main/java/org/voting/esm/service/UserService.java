package org.voting.esm.service;

import org.springframework.stereotype.Service;
import org.voting.esm.model.User;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> findAll();

    User registerUser(User user);

    Optional<User> findUserById(Long id);
}
