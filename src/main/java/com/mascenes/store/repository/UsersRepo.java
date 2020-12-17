package com.mascenes.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mascenes.store.model.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Long> {
    Users findById(long id);

    Users findByUserName(String userName);
}