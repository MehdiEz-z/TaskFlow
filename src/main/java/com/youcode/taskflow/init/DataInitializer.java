package com.youcode.taskflow.init;

import com.youcode.taskflow.model.entity.Role;
import com.youcode.taskflow.model.enums.UserRole;
import com.youcode.taskflow.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DataInitializer implements CommandLineRunner {
    private final RoleRepository roleRepository;
    public DataInitializer(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        initRoles();
    }
    private void initRoles() {
        for (UserRole role : UserRole.values()) {
            roleRepository.save(new Role(null, role));
        }
    }
}
