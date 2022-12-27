package com.study.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.member.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
