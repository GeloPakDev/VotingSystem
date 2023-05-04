package org.voting.esm.service;

import org.springframework.stereotype.Service;
import org.voting.esm.model.Law;

import java.util.List;
import java.util.Optional;

@Service
public interface LawService {
    List<Law> findAll();

    Optional<Law> findLawById(Long id);

    Law create(Law law);

    void voteForLaw(Long id);

    void voteAgainstLaw(Long id);
}
