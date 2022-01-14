package com.priyapritty.survey.question_type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/question_type")
public class QuestionTypeController {
    private final QuestionTypeService questionTypeService;

    @Autowired
    public QuestionTypeController(QuestionTypeService questionTypeService) {
        this.questionTypeService = questionTypeService;
    }

    @GetMapping
    public List<QuestionType> getQuestionType() {
        return questionTypeService.getQuestionType();

    }

    @PostMapping
    public void postQuestionType(@RequestBody QuestionType questionType){
        questionTypeService.postQuestionType(questionType);
    }
}



