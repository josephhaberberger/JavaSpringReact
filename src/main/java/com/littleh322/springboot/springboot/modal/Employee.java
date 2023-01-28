package com.littleh322.springboot.springboot.modal;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tb_emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private String department;

    @Column
    private Date dob;

    @Column
    private String gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNameAndGender() {
        return this.name + " " + this.gender;
    }

    public int calculateAvgTimeSpent(int num1, int num2) {
        if(num2 == 0)
            throw new IllegalArgumentException("Cannot divide by zero.");
        return num1 / num2;
    }
}
