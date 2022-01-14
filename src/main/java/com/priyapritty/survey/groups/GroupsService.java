package com.priyapritty.survey.groups;

import com.priyapritty.survey.question.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupsService {
    private GroupsRepository groupsRepository;

    @Autowired
    public GroupsService(GroupsRepository groupsRepository){
        this.groupsRepository = groupsRepository;
    }
    public List<Groups> getGroups(){
        return groupsRepository.findAll();
    }
    public void postGroups(Groups groups){
        groupsRepository.save(groups);
    }


}
