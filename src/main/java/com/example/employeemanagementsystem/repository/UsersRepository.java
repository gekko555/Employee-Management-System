package com.example.employeemanagementsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemanagementsystem.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    //usernameで検索（ログイン用）
    Optional<Users> findByUsername(String username);

    //employee_idで検索（関連付け）
    Optional<Users> findByEmployeeId(Long employeeId);
    
}
