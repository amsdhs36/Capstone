package com.spring.app.repository;

import java.util.Optional;

import com.spring.app.models.ERole;
import com.spring.app.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
