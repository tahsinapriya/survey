package com.priyapritty.survey.question_type;
import com.priyapritty.survey.question.Question;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class QuestionType {
    @Id
    @SequenceGenerator(
            name = "question_type_sequence",
            sequenceName = "question_type_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "question_type_sequence"
    )
    private long id;
    private String typeName;

    public QuestionType() {
    }

    public QuestionType(long id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public QuestionType(String typeName) {
        this.typeName = typeName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
