package com.example.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagementsystem.dto.EmployeeCreateDto;
import com.example.employeemanagementsystem.dto.EmployeeDisplayDto;
import com.example.employeemanagementsystem.service.EmployeeService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5173"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // 全社員取得
    @GetMapping("/employees")
    public List<EmployeeDisplayDto> getAllEmployees() {
        return employeeService.getAllEmployeesDisplay(); // ← 全社員用メソッド
    }

    @PostMapping("/employees")
    public EmployeeDisplayDto addEmployee(@RequestBody EmployeeCreateDto createDto) {
        return employeeService.createEmployee(createDto);
    }

}
