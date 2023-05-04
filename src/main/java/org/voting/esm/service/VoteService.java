package org.voting.esm.service;

import org.springframework.stereotype.Service;
import org.voting.esm.model.Vote;

import java.util.List;
import java.util.Optional;

@Service
public interface VoteService {
    List<Vote> findAll();

    Optional<Vote> findVoteById(Long id);

    Vote create(Vote vote);
}
