package org.voting.esm.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDate;

import static org.voting.esm.util.ColumnName.*;

@Entity
@Table(name = VOTE_TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = VOTE_START_DATE)
    private LocalDate startDate;
    @NotNull
    @Column(name = VOTE_END_DATE)
    private LocalDate endDate;
    @NotNull
    @Column(name = VOTE_TOTAL_VOTES)
    private Integer totalVotes;
    @NotNull
    @Column(name = CATEGORY_ID)
    private Integer categoryId;
    @NotNull
    @Column(name = DESCRIPTION)
    private String description;
}