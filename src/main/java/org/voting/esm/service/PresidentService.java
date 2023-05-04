package org.voting.esm.service;

import org.springframework.stereotype.Service;
import org.voting.esm.model.President;

import java.util.List;
import java.util.Optional;

@Service
public interface PresidentService {
    List<President> findAll();

    Optional<President> findPresidentById(Long id);

    President create(President president);

    void voteForPresident(Long id);

}
