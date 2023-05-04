package org.voting.esm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.voting.esm.model.President;

@Repository
public interface PresidentRepository extends JpaRepository<President, Long> {
    @Modifying
    @Query("UPDATE President president SET president.voteNumbers = :voteNumbers WHERE president.id = :id")
    void updateTotalVotes(@Param("id") Long id, @Param("voteNumbers") Integer voteNumbers);

    @Query("SELECT president.voteNumbers FROM President president WHERE president.id = :id")
    Integer findTotalVotes(@Param("id") Long id);
}
