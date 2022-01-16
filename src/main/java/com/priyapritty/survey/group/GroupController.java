package com.priyapritty.survey.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/group")
public class GroupController {
    private final GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }
    @GetMapping
    public List<Group> getGroup(){
        return groupService.getGroup();
    }
    @PostMapping
    public void postGroups(@RequestBody Group group){
        groupService.postGroup(group);
    }

}
