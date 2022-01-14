package com.priyapritty.survey.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/question")
public class QuestionController {
    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getQuestion() {
        return questionService.getQuestion();

    }
    @PostMapping
    public void postQuestion(@RequestBody Question question){
        questionService.postQuestion(question);
    }

}

