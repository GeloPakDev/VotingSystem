package org.voting.esm.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;

import static org.voting.esm.util.ColumnName.CATEGORY_ID;
import static org.voting.esm.util.ColumnName.LAW_CREATE_DATE;
import static org.voting.esm.util.ColumnName.LAW_DESCRIPTION;
import static org.voting.esm.util.ColumnName.LAW_TABLE_NAME;
import static org.voting.esm.util.ColumnName.LAW_TITLE;
import static org.voting.esm.util.ColumnName.LAW_TYPE;
import static org.voting.esm.util.ColumnName.VOTE_AGAINST;
import static org.voting.esm.util.ColumnName.VOTE_FOR;
import static org.voting.esm.util.ColumnName.VOTE_ID;

@Entity
@Table(name = LAW_TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Law {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = LAW_TITLE)
    private String title;
    @NotNull
    @Column(name = LAW_DESCRIPTION)
    private String description;
    @NotNull
    @Column(name = LAW_CREATE_DATE)
    private LocalDate createDate;
    @NotNull
    @Column(name = LAW_TYPE)
    private String type;
    @Column(name = VOTE_ID)
    private Long voteId;
    @Column(name = CATEGORY_ID)
    private String categoryId;
    @Column(name = VOTE_FOR)
    private Integer voteFor;
    @Column(name = VOTE_AGAINST)
    private Integer voteAgainst;
}
