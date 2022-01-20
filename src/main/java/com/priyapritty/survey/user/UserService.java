package com.priyapritty.survey.user;

import com.priyapritty.survey.question.Question;
import com.priyapritty.survey.question.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser() {
        return userRepository.findAll();
    }

    public void postUser(User user){
        userRepository.save(user);
    }

}
