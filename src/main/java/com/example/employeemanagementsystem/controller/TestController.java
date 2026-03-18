package com.example.employeemanagementsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.entity.Users;
import com.example.employeemanagementsystem.service.EmployeeService;
import com.example.employeemanagementsystem.service.UserService;

@RestController
public class TestController {

    @Autowired
    private EmployeeService employeeService;
    
    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test(){
        List<Employee> employees = employeeService.getAllEmployees();

        Optional<Users> user = userService.findByUsername("yamada");

        return "社員数:" + employees.size() + 
              ", ユーザー検索: " + (user.isPresent() ? "成功" : "失敗");
    }
}
