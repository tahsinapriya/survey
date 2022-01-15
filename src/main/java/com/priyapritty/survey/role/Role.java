package com.priyapritty.survey.role;

import javax.persistence.*;

@Entity
@Table
public class Role {
    @Id
    @SequenceGenerator(
            name = "users_sequence",
            sequenceName = "users_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence"
    )
    private long id;
    private String name;
}
