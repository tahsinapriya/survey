package com.priyapritty.survey.groups;
import com.priyapritty.survey.groups.Groups;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Groups {
    @Id
    @SequenceGenerator(
            name = "groups_sequence",
            sequenceName = "groups_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "groups_sequence"
    )
    private long id;
    private String descriptions;

    public Groups() {
    }

    public Groups(String descriptions) {
        this.descriptions = descriptions;
    }

    public Groups(long id, String descriptions) {
        this.id = id;
        this.descriptions = descriptions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}