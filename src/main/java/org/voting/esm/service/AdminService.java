package org.voting.esm.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    List<Integer> getHomeData();
}
