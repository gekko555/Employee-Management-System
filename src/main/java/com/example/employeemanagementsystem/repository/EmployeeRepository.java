package com.example.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.employeemanagementsystem.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //全権取得（ID昇順）
    @Query("SELECT e FROM Employee e ORDER BY e.id ASC")
    List<Employee> findAllOrderedByid();

    //倫理削除（Statusを『'退職'』に更新）
    @Modifying
    @Query("UPDATE Employee e SET e.status = '退職' WHERE e.id = :id")
    int logicalDeleteById(@Param("id") Long id);

    //部署で検索
    List<Employee> findByDepartment(String department);

    //在籍状況で検索
    List<Employee> findByStatus(String status);
    
}
