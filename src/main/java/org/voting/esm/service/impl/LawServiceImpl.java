package org.voting.esm.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.voting.esm.model.Law;
import org.voting.esm.repository.LawRepository;
import org.voting.esm.service.LawService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LawServiceImpl implements LawService {
    private final LawRepository lawRepository;

    @Override
    public List<Law> findAll() {
        return lawRepository.findAll();
    }

    @Override
    public Optional<Law> findLawById(Long id) {
        return lawRepository.findById(id);
    }

    @Override
    public Law create(Law law) {
        return lawRepository.save(law);
    }

    @Override
    @Transactional
    public void voteForLaw(Long id) {
        int totalVotes = lawRepository.findVoteForPoints(id);
        totalVotes += 1;
        lawRepository.voteForLaw(id, totalVotes);
    }

    @Override
    @Transactional
    public void voteAgainstLaw(Long id) {
        int totalVotes = lawRepository.findVoteAgainstPoints(id);
        totalVotes += 1;
        lawRepository.voteAgainstLaw(id, totalVotes);
    }
}
