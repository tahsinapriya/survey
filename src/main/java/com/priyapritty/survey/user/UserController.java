package com.priyapritty.survey.user;

import com.priyapritty.survey.question.Question;
import com.priyapritty.survey.question.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser() {
        return userService.getUser();

    }
    @PostMapping
    public void postUser(@RequestBody User user){
        userService.postUser(user);
    }

}


