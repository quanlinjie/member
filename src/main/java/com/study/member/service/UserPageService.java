package com.study.member.service;

import org.springframework.stereotype.Service;

import com.study.member.entity.User;
import com.study.member.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserPageService {
    private final UserRepository userRepository;

    public User findById(int id) {
        User findUser = userRepository.findById(id);
        return findUser;
    }
}
