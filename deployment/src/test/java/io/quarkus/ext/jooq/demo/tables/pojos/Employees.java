/*
 * This file is generated by jOOQ.
 */
package io.quarkus.ext.jooq.demo.tables.pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.annotation.Generated;

import io.quarkus.ext.jooq.demo.enums.EmployeesGender;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@RegisterForReflection
@Generated("2020-08-21")
public class Employees implements Serializable {

    private static final long serialVersionUID = -1378710263;

    private Integer empNo;

    private LocalDate birthDate;

    private String firstName;

    private String lastName;

    private EmployeesGender gender;

    private LocalDate hireDate;

    public Employees() {
    }

    public Employees(Employees value) {
        this.empNo = value.empNo;
        this.birthDate = value.birthDate;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.gender = value.gender;
        this.hireDate = value.hireDate;
    }

    public Employees(Integer empNo, LocalDate birthDate, String firstName, String lastName, EmployeesGender gender, LocalDate hireDate) {
        this.empNo = empNo;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    public Integer getEmpNo() {
        return this.empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmployeesGender getGender() {
        return this.gender;
    }

    public void setGender(EmployeesGender gender) {
        this.gender = gender;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Employees (");
        sb.append(empNo);
        sb.append(", ").append(birthDate);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(gender);
        sb.append(", ").append(hireDate);
        sb.append(")");
        return sb.toString();
    }

    /**
     * Subclass may override this method
     */
    @Override
    public Employees clone() throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.empNo = this.empNo;
        employees.birthDate = this.birthDate;
        employees.firstName = this.firstName;
        employees.lastName = this.lastName;
        employees.gender = gender;
        employees.hireDate = this.hireDate;
        return employees;
    }
}