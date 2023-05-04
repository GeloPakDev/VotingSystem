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
@Table(name = USER_TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = USER_FIRST_NAME)
    private String firstName;
    @NotNull
    @Column(name = USER_LAST_NAME)
    private String lastName;
    @NotNull
    @Column(name = USER_BIRTH_DATE)
    private LocalDate birthDate;
    @NotNull
    @Column(name = USER_ADDRESS)
    private String address;
    @NotNull
    @Column(name = USER_PASSPORT_NUMBER)
    private String passportNumber;
    @NotNull
    @Column(name = USER_PASSPORT_ISSUE_DATE)
    private LocalDate passportIssueDate;
    @NotNull
    @Column(name = USER_PASSPORT_EXPIRE_DATE)
    private LocalDate passportExpireDate;
    @NotNull
    @Column(name = USER_LOGIN)
    private String login;
    @NotNull
    @Column(name = USER_PASSWORD)
    private String password;
    @NotNull
    @Column(name = USER_ROLE)
    private String role;
}
