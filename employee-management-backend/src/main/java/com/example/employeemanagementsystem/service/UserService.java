package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.repository.UsersRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.entity.Users;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    public Optional<Users> findByUsername(String username) {
        return usersRepository.findByUsername(username);
    }

    public Optional<Users> findByEmployeeId(Long employeeId) {
        return usersRepository.findByEmployeeId(employeeId);
    }
    
}
