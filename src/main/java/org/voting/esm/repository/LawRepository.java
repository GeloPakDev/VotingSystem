package org.voting.esm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.voting.esm.model.Law;


@Repository
public interface LawRepository extends JpaRepository<Law, Long> {
    @Modifying
    @Query("UPDATE Law law SET law.voteFor = :voteFor WHERE law.id = :id")
    void voteForLaw(@Param("id") Long id, @Param("voteFor") Integer voteFor);

    @Modifying
    @Query("UPDATE Law law SET law.voteAgainst = :voteAgainst WHERE law.id = :id")
    void voteAgainstLaw(@Param("id") Long id, @Param("voteAgainst") Integer voteAgainst);

    @Query("SELECT law.voteFor FROM Law law WHERE law.id = :id")
    Integer findVoteForPoints(@Param("id") Long id);

    @Query("SELECT law.voteAgainst FROM Law law WHERE law.id = :id")
    Integer findVoteAgainstPoints(@Param("id") Long id);
}
