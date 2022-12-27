package com.study.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.member.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    User findByUsername(String username);
    User findById(int id);

}
