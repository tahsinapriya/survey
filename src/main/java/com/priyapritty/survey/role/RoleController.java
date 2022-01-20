package com.priyapritty.survey.role;

import com.priyapritty.survey.question.Question;
import com.priyapritty.survey.question.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/role")
public class RoleController {
    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<Role> getRole() {
        return roleService.getRole();

    }
    @PostMapping
    public void postRole(@RequestBody Role role){
        roleService.postRole(role);
    }

}


