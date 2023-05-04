package org.voting.esm.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.voting.esm.repository.CategoryRepository;
import org.voting.esm.repository.UserRepository;
import org.voting.esm.repository.VoteRepository;
import org.voting.esm.service.AdminService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;
    private final VoteRepository voteRepository;

    @Override
    public List<Integer> getHomeData() {
        int totalUsers = userRepository.findTotalUsers();
        int totalCategories = categoryRepository.findTotalCategories();
        int totalVotes = voteRepository.findTotalCategories();
        return List.of(totalUsers, totalCategories, totalVotes);
    }
}
