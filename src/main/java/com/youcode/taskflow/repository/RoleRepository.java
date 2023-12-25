package com.youcode.taskflow.repository;

import com.youcode.taskflow.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
