package com.priyapritty.survey.group_question_mapping;

import com.priyapritty.survey.group_question_mapping.GroupQuestionMapping;
import com.priyapritty.survey.groups.Groups;
import com.priyapritty.survey.question.Question;

import javax.persistence.*;

@Entity
@Table
public class GroupQuestionMapping {
    @Id
    @SequenceGenerator(
            name = "group_question_mapping_sequence",
            sequenceName = "group_question_mapping_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "group_question_mapping_sequence"
    )
    private long id;

    @ManyToOne
    private Groups groups;
    @ManyToOne
    private Question question;

    public GroupQuestionMapping() {
    }

    public GroupQuestionMapping(long id,Groups groups,Question question) {
        this.id = id;
        this.groups = groups;
        this.question = question;
    }
    public GroupQuestionMapping(Groups groups,Question question ) {
        this.groups = groups;
        this.question = question;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}