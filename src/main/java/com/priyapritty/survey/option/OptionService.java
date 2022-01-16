package com.priyapritty.survey.option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {
    private OptionRepository optionRepository;

    @Autowired
    public OptionService(OptionRepository optionRepository){
        this.optionRepository = optionRepository;
    }
    public List<Option> getOption(){
        return optionRepository.findAll();
    }


}
