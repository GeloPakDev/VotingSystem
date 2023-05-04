package org.voting.esm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.voting.esm.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("SELECT COUNT(category.id) FROM Category category")
    int findTotalCategories();
}
