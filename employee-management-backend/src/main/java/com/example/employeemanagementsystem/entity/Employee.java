package com.example.employeemanagementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    //社員ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //社員名
    @Column(nullable = false)
    private String name;

    //ふりがな
    @Column(nullable = false)
    private String furigana;

    //メールアドレス
    @Column(nullable = false)
    private String email;
    
    //年齢
    @Column(nullable = false)
    private Integer age;

    //住所
    @Column(nullable = false)
    private String address;

    //部署名
    @Column(nullable = false)
    private String department;

    //入社日
    @Column(nullable = false)
    private String hireDate;
    
    //在籍状況
    @Column(nullable = false)
    private String status;

    //作成日時
    @Column(nullable = false)
    private String createdAt;
    
    //更新日時
    @Column(nullable = false)
    private String updatedAt;

    public Employee(){}

    public Employee(String name, String furigana, String email, Integer age, String address, String department, String hireDate, String status, String createdAt, String updatedAt) {
        this.name = name;
        this.furigana = furigana;
        this.email = email;
        this.age = age;
        this.address = address;
        this.department = department;
        this.hireDate = hireDate;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurigana() {
        return furigana;
    }

    public void setFurigana(String furigana) {
        this.furigana = furigana;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    
}
