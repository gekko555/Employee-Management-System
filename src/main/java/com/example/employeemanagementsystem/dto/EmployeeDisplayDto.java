package com.example.employeemanagementsystem.dto;

public class EmployeeDisplayDto {

    //社員ID
    private Long id;

    //名前
    private String name;

    //フリガナ
    private String furigana;

    //年齢
    private Integer age;

    //Email
    private String email;

    //住所
    private String address;

    //部署名
    private String department;

    //入社日
    private String hireDate;

    //在籍状況
    private String status;

    // デフォルトコンストラクタ
    public EmployeeDisplayDto() {}

    // コンストラクタ（引数の学習用）
    public EmployeeDisplayDto(Long id, String name, String furigana, 
                             String email, String address, String department, String hireDate, String status, Integer age) {
        this.id = id;
        this.name = name;
        this.furigana = furigana;
        this.email = email;
        this.address = address;
        this.department = department;
        this.hireDate = hireDate;
        this.status = status;
        this.age = age;
    }

    // GetterとSetter
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
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
}
