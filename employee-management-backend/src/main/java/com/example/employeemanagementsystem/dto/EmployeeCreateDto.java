package com.example.employeemanagementsystem.dto;

public class EmployeeCreateDto {
    private String name;
    private String furigana;
    private String email;
    private String address;
    private String department;
    private String hireDate;
    private String status;
    private String age;

    public EmployeeCreateDto(){}

    //数値に変換するメソッド
    public Integer getAgeAsInteger(){
        try{
            return Integer.parseInt(age);
        } catch(NumberFormatException e){
            return 18;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getFurigana(){
        return furigana;
    }

    public void setFurigana(String furigana){
        this.furigana = furigana;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getHireDate(){
        return hireDate;
    }

    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getAge(){
        return age;
    }

    public void setAge(String age){
        this.age = age;
    }

}
