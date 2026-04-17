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

        //社員追加（INSERT）
    // JpaRepositoryのsave()メソッドが自動的にINSERT処理をしてくれます
    // 明示的にメソッドを定義する必要はありません

}
