package com.example.employeemanagementsystem.entity;

import jakarta.persistence.*;
 
@Entity
@Table(name = "users")
public class Users {
 
    //ユーザーID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    //ログインID
    @Column(nullable = false, unique = true)
    private String username;
 
    //パスワード
    @Column(nullable = false)
    private String password;
 
    //権限
    @Column(nullable = false)
    private String role;
 
    //社員ID
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;
 
    //作成日時
    @Column(updatable = false)
    private java.time.LocalDateTime createdAt;
 
    //更新日時
    private java.time.LocalDateTime updatedAt;
 
    // デフォルトコンストラクタ（JPA必須）
    public Users() {}
 
    // コンストラクタ（引数の学習用）
    public Users(String username, String password, String role, Long employeeId) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.employeeId = employeeId;
    }
 
    // GetterとSetter
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
 
    public Long getEmployeeId() {
        return employeeId;
    }
 
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
 
    public java.time.LocalDateTime getCreatedAt() {
        return createdAt;
    }
 
    public void setCreatedAt(java.time.LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
 
    public java.time.LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
 
    public void setUpdatedAt(java.time.LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    
}
