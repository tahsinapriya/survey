package com.priyapritty.survey.options;

import com.priyapritty.survey.question.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/options")
public class OptionsController {
    private final OptionsService optionsService;

    @Autowired
    public OptionsController(OptionsService optionsService) {
        this.optionsService = optionsService;
    }
    @GetMapping
    public List<Options> getOptions(){
        return optionsService.getOptions();
    }

}
