package org.voting.esm.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.voting.esm.model.Law;
import org.voting.esm.service.LawService;

import java.util.List;
import java.util.Optional;

import static org.voting.esm.util.RequestParams.ID;
import static org.voting.esm.util.WebPaths.*;
import static org.voting.esm.util.WebPaths.JSON;

@RestController
@RequestMapping(path = BASE_URL + API + LAWS, produces = JSON)
@RequiredArgsConstructor
public class LawController {
    private final LawService lawService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Law> findAll() {
        return lawService.findAll();
    }

    @GetMapping(params = ID)
    public ResponseEntity<Object> findLawById(@RequestParam Long id) {
        //Retrieve Position from the DB
        Optional<Law> lawOptional = lawService.findLawById(id);
        if (lawOptional.isPresent()) {
            var law = lawOptional.get();
            return ResponseEntity.ok().body(law);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public ResponseEntity<Object> createLaw(@RequestBody Law law) {
        Law createdLaw = lawService.create(law);
        return ResponseEntity.ok().body(createdLaw);
    }

    @PatchMapping(path = VOTE_FOR, params = ID)
    public void voteForLaw(@RequestParam Long id) {
        lawService.voteForLaw(id);
    }
    @PatchMapping(path = VOTE_AGAINST, params = ID)
    public void voteAgainstLaw(@RequestParam Long id) {
        lawService.voteAgainstLaw(id);
    }
}