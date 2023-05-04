package org.voting.esm.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.voting.esm.model.Vote;
import org.voting.esm.service.VoteService;

import java.util.List;
import java.util.Optional;

import static org.voting.esm.util.RequestParams.ID;
import static org.voting.esm.util.WebPaths.*;
import static org.voting.esm.util.WebPaths.JSON;

@RestController
@RequestMapping(path = BASE_URL + API + VOTES, produces = JSON)
@RequiredArgsConstructor
public class VoteController {
    private final VoteService voteService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Vote> findAll() {
        return voteService.findAll();
    }

    @GetMapping(params = ID)
    public ResponseEntity<Object> findLawById(@RequestParam Long id) {
        //Retrieve Position from the DB
        Optional<Vote> voteOptional = voteService.findVoteById(id);
        if (voteOptional.isPresent()) {
            var vote = voteOptional.get();
            return ResponseEntity.ok().body(vote);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public ResponseEntity<Object> createLaw(@RequestBody Vote vote) {
        Vote createdVote = voteService.create(vote);
        return ResponseEntity.ok().body(createdVote);
    }
}
