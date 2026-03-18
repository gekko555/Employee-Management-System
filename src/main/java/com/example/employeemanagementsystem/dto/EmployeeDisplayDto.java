package com.example.employeemanagementsystem.dto;

public class EmployeeDisplayDto {

    //社員ID
    private Long employeeId;

    //名前
    private String name;

    //フリガナ
    private String furigana;

    //Email
    private String email;

    //部署名
    private String department;

    //入社日
    private String hireDate;

    //在籍状況
    private String status;

    // デフォルトコンストラクタ
    public EmployeeDisplayDto() {}

    // コンストラクタ（引数の学習用）
    public EmployeeDisplayDto(Long employeeId, String name, String furigana, 
                             String email, String department, String hireDate, String status) {
        this.employeeId = employeeId;
        this.name = name;
        this.furigana = furigana;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.status = status;
    }

    // GetterとSetter
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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
}
