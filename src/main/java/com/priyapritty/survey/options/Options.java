package com.priyapritty.survey.options;
import com.priyapritty.survey.options.Options;
import com.priyapritty.survey.question.Question;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Options {
    @Id
    @SequenceGenerator(
            name = "options_sequence",
            sequenceName = "options_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "options_sequence"
    )
    private long id;
    private String descriptions;
    @ManyToOne
    private Question question;

    public Options() {
    }

    public Options(long id ,String descriptions,Question question) {
        this.id = id;
        this.descriptions = descriptions;
        this.question = question;
    }

    public Options(String descriptions,Question question) {
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