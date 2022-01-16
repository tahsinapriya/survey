package com.priyapritty.survey.option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/option")
public class OptionController {
    private final OptionService optionService;

    @Autowired
    public OptionController(OptionService optionService) {
        this.optionService = optionService;
    }
    @GetMapping
    public List<Option> getOption(){
        return optionService.getOption();
    }

}
