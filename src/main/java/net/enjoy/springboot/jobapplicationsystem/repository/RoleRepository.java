package net.enjoy.springboot.jobapplicationsystem.repository;

import net.enjoy.springboot.jobapplicationsystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}