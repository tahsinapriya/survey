package com.priyapritty.survey.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    private GroupRepository groupRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }
    public List<Group> getGroup(){
        return groupRepository.findAll();
    }
    public void postGroup(Group group){
        groupRepository.save(group);
    }


}
