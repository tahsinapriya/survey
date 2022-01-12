package com.priyapritty.survey.answer;
import com.priyapritty.survey.answer.Answer;
import com.priyapritty.survey.groups.Groups;
import com.priyapritty.survey.question.Question;
import com.priyapritty.survey.users.Users;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Answer {
    @Id
    @SequenceGenerator(
            name = "answer_sequence",
            sequenceName = "answer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "answer_sequence"
    )
    private long id;
    private String answer;
    @ManyToOne
    private Users users;
    @ManyToOne
    private Groups groups;
    @ManyToOne
    private Question question;

    public Answer() {
    }

    public Answer(long id, String answer, Users users, Groups groups, Question question) {
        this.id = id;
        this.answer = answer;
        this.users = users;
        this.groups = groups;
        this.question = question;
    }

    public Answer(String answer, Users users, Groups groups, Question question) {
        this.answer = answer;
        this.users = users;
        this.groups = groups;
        this.question = question;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}