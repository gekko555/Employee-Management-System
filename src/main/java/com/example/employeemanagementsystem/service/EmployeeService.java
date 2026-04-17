package com.example.employeemanagementsystem.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.dto.EmployeeCreateDto;
import com.example.employeemanagementsystem.dto.EmployeeDisplayDto;
import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // 全社員情報取得(ID昇順)→DTOに変換
    public List<EmployeeDisplayDto> getAllEmployeesDisplay() {
        // RepositoryからEntityを取得してDTOに変換して返す
      List<Employee> employees = employeeRepository.findAllOrderedByid();
      List<EmployeeDisplayDto> dtoList = new ArrayList<>();
      
      for(Employee emp : employees){
        dtoList.add(convertToDto(emp));
      }
      return dtoList;
    }

    private EmployeeDisplayDto convertToDto(Employee employee) {
        return new EmployeeDisplayDto(
                employee.getId(),
                employee.getName(),
                employee.getFurigana(),
                employee.getEmail(),
                employee.getAddress(),
                employee.getDepartment(),
                employee.getHireDate(),
                employee.getStatus(),
                employee.getAge());
    }

    public EmployeeDisplayDto createEmployee(EmployeeCreateDto createDto){
        Employee employees = new Employee();
        employees.setName(createDto.getName());
        employees.setFurigana(createDto.getFurigana());
        employees.setEmail(createDto.getEmail());
        employees.setAddress(createDto.getAddress());
        employees.setDepartment(createDto.getDepartment());
        employees.setHireDate(createDto.getHireDate());
        employees.setStatus(createDto.getStatus());
        employees.setAge(createDto.getAgeAsInteger());

        String now = LocalDateTime.now().toString();
        employees.setCreatedAt(now);
        employees.setUpdatedAt(now);

        // 保存
        Employee savedEmployee = employeeRepository.save(employees);
        
        // DTOに変換して返す
        return convertToDto(savedEmployee);
    }

}
