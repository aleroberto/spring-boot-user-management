package com.aleroberto.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aleroberto.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
