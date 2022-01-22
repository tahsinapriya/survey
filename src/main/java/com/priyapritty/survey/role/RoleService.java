package com.priyapritty.survey.role;

import com.priyapritty.survey.role.Role;
import com.priyapritty.survey.role.RoleRepository;
import com.priyapritty.survey.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getRole() {
        return roleRepository.findAll();
    }

    public void postRole(Role role){
        roleRepository.save(role);
    }

    public Role getRole(String name) {
        return roleRepository.findByName(name);
    }

}
