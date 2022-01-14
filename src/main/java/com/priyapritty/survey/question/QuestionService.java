package com.priyapritty.survey.question;
import com.priyapritty.survey.question_type.QuestionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class QuestionService {
    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuestion() {
        return questionRepository.findAll();
    }

    public void postQuestion(Question question){
        questionRepository.save(question);
    }
}

