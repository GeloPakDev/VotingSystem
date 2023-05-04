package org.voting.esm.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.voting.esm.model.User;
import org.voting.esm.service.UserService;

import java.util.List;
import java.util.Optional;

import static org.voting.esm.util.RequestParams.ID;
import static org.voting.esm.util.WebPaths.*;
import static org.voting.esm.util.WebPaths.JSON;

@RestController
@RequestMapping(path = BASE_URL + API + USERS, produces = JSON)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(params = ID)
    public ResponseEntity<Object> findUserById(@RequestParam Long id) {
        //Retrieve Position from the DB
        Optional<User> userOptional = userService.findUserById(id);
        if (userOptional.isPresent()) {
            var user = userOptional.get();
            return ResponseEntity.ok().body(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
}