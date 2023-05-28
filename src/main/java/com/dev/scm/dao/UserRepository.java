package com.dev.scm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.scm.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
