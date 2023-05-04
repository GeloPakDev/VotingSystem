package org.voting.esm.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.voting.esm.model.Vote;
import org.voting.esm.repository.VoteRepository;
import org.voting.esm.service.VoteService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VoteServiceImpl implements VoteService {
    private final VoteRepository voteRepository;

    @Override
    public List<Vote> findAll() {
        return voteRepository.findAll();
    }

    @Override
    public Optional<Vote> findVoteById(Long id) {
        return voteRepository.findById(id);
    }

    @Override
    public Vote create(Vote vote) {
        return voteRepository.save(vote);
    }
}
