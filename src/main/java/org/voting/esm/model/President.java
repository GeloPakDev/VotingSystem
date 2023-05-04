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
@Table(name = PRESIDENT_TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class President {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = PRESIDENT_FIRST_NAME)
    private String firstName;
    @NotNull
    @Column(name = PRESIDENT_LAST_NAME)
    private String lastName;
    @NotNull
    @Column(name = PRESIDENT_PARTY_NAME)
    private String partyName;
    @NotNull
    @Column(name = PRESIDENT_BIOGRAPHY)
    private String biography;
    @NotNull
    @Column(name = PRESIDENT_FUTURE_PLANS)
    private String futurePlans;
    @NotNull
    @Column(name = PRESIDENT_BIRTH_DATE)
    private LocalDate birthDate;
    @NotNull
    @Column(name = PRESIDENT_VOTE_NUMBERS)
    private Integer voteNumbers;
    @NotNull
    @Column(name = VOTE_ID)
    private Long voteId;
}