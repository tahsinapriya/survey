package com.priyapritty.survey.option;
import com.priyapritty.survey.question.Question;

import javax.persistence.*;

@Entity
@Table
public class Option {
    @Id
    @SequenceGenerator(
            name = "option_sequence",
            sequenceName = "option_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "option_sequence"
    )
    private long id;
    private String descriptions;
    @ManyToOne
    private Question question;

    public Option() {
    }

    public Option(long id , String descriptions, Question question) {
        this.id = id;
        this.descriptions = descriptions;
        this.question = question;
    }

    public Option(String descriptions, Question question) {
        this.descriptions = descriptions;
        this.question = question;
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