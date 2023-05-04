package org.voting.esm.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.voting.esm.model.President;
import org.voting.esm.service.PresidentService;

import java.util.List;
import java.util.Optional;

import static org.voting.esm.util.RequestParams.ID;
import static org.voting.esm.util.WebPaths.*;
import static org.voting.esm.util.WebPaths.JSON;

@RestController
@RequestMapping(path = BASE_URL + API + PRESIDENTS, produces = JSON)
@RequiredArgsConstructor
public class PresidentsController {
    private final PresidentService presidentService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<President> findAll() {
        return presidentService.findAll();
    }

    @GetMapping(params = ID)
    public ResponseEntity<Object> findPresidentById(@RequestParam Long id) {
        //Retrieve Position from the DB
        Optional<President> presidentOptional = presidentService.findPresidentById(id);
        if (presidentOptional.isPresent()) {
            var president = presidentOptional.get();
            return ResponseEntity.ok().body(president);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public ResponseEntity<Object> createPresident(@RequestBody President president) {
        President createdPresident = presidentService.create(president);
        return ResponseEntity.ok().body(createdPresident);
    }


    @PatchMapping(path = VOTE_FOR, params = ID)
    public void voteForLaw(@RequestParam Long id) {
        presidentService.voteForPresident(id);
    }
}
