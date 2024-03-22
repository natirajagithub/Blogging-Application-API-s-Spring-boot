package com.Natiraj.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Natiraj.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
