package com.example.quickjobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.quickjobs.entiry.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
