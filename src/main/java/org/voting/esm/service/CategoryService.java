package org.voting.esm.service;

import org.springframework.stereotype.Service;
import org.voting.esm.model.Category;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> findAll();

    Category create(Category law);

}