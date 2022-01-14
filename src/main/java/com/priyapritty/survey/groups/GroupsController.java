package com.priyapritty.survey.groups;

import com.priyapritty.survey.groups.GroupsService;
import com.priyapritty.survey.question.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/groups")
public class GroupsController {
    private final GroupsService groupsService;

    @Autowired
    public GroupsController(GroupsService groupsService) {
        this.groupsService = groupsService;
    }
    @GetMapping
    public List<Groups> getGroups(){
        return groupsService.getGroups();
    }
    @PostMapping
    public void postGroups(@RequestBody Groups groups){
        groupsService.postGroups(groups);
    }

}
