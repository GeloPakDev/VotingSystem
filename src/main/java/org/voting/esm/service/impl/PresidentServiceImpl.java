package org.voting.esm.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.voting.esm.model.President;
import org.voting.esm.repository.PresidentRepository;
import org.voting.esm.service.PresidentService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PresidentServiceImpl implements PresidentService {
    private final PresidentRepository presidentRepository;

    @Override
    public List<President> findAll() {
        return presidentRepository.findAll();
    }

    @Override
    public Optional<President> findPresidentById(Long id) {
        return presidentRepository.findById(id);
    }

    @Override
    public President create(President president) {
        return presidentRepository.save(president);
    }

    @Override
    @Transactional
    public void voteForPresident(Long id) {
        int totalVotes = presidentRepository.findTotalVotes(id);
        totalVotes += 1;
        presidentRepository.updateTotalVotes(id, totalVotes);
    }
}
