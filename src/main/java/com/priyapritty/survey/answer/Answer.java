package com.priyapritty.survey.answer;
import com.priyapritty.survey.group.Group;
import com.priyapritty.survey.question.Question;
import com.priyapritty.survey.user.User;

import javax.persistence.*;

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
    private User user;
    @ManyToOne
    private Group group;
    @ManyToOne
    private Question question;

    public Answer() {
    }

    public Answer(long id, String answer, User user, Group group, Question question) {
        this.id = id;
        this.answer = answer;
        this.user = user;
        this.group = group;
        this.question = question;
    }

    public Answer(String answer, User users, Group group, Question question) {
        this.answer = answer;
        this.user = users;
        this.group = group;
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

    public User getUsers() {
        return user;
    }

    public void setUsers(User users) {
        this.user = users;
    }

    public Group getGroups() {
        return group;
    }

    public void setGroups(Group group) {
        this.group = group;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}