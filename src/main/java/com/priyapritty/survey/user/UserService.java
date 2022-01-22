package com.priyapritty.survey.user;

import com.priyapritty.survey.role.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void postUser(User user){
        userRepository.save(user);
    }

    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Transactional
    public void addRoleToUser(User user, Role role) {
        user.getRoles().add(role);
    }

}
