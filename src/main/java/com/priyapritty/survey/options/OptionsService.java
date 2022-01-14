package com.priyapritty.survey.options;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionsService {
    private OptionsRepository optionsRepository;

    @Autowired
    public OptionsService(OptionsRepository optionsRepository){
        this.optionsRepository = optionsRepository;
    }
    public List<Options> getOptions(){
        return optionsRepository.findAll();
    }


}
