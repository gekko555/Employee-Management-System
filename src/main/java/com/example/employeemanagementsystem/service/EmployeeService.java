package com.example.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    //全社員情報取得(ID昇順)
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAllOrderedByid();
    }

    //部署で検索
    public List<Employee> getfindByDepartment(String department){
        return employeeRepository.findByDepartment(department);
    }

    //在籍状況で検索
    public List<Employee> findByStatus(String status){
        return employeeRepository.findByStatus(status);
    }


}
