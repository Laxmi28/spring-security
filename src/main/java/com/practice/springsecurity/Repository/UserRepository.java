package com.practice.springsecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.springsecurity.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
