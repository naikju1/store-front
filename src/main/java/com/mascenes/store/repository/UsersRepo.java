package com.mascenes.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mascenes.store.model.Users;

import java.util.List;

@Repository
public interface UsersRepo extends JpaRepository<Users, Long> {
    @Override
    List<Users> findAll();

    Users findByUserName(String userName);
}