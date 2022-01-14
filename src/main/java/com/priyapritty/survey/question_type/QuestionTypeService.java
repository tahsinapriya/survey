package com.priyapritty.survey.question_type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Service
public class QuestionTypeService {
    private final QuestionTypeRepository questionTypeRepository;

    @Autowired
    public QuestionTypeService(QuestionTypeRepository questionTypeRepository) {
        this.questionTypeRepository = questionTypeRepository;
    }

    public List<QuestionType> getQuestionType() {
        return questionTypeRepository.findAll();
    }

    public void postQuestionType(QuestionType questionType) {
        questionTypeRepository.save(questionType);
    }
}

