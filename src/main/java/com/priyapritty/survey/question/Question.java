package com.priyapritty.survey.question;

import com.priyapritty.survey.question_type.QuestionType;

import javax.persistence.*;

@Entity
@Table
public class Question {
    @Id
    @SequenceGenerator(
            name = "question_sequence",
            sequenceName = "question_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "question_sequence"
    )
    private long id;
    private String description;

    @ManyToOne
    private QuestionType questionType;

    public Question() {
    }

    public Question(String description, QuestionType questionType) {
        this.description = description;
        this.questionType = questionType;
    }

    public Question(long id, String description, QuestionType questionType) {
        this.id = id;
        this.description = description;
        this.questionType = questionType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
}
