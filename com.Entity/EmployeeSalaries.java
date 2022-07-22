package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="employee_salaries")
@Entity
public class EmployeeSalaries {
@Id
private int EmpId;
private String Name;
private double BasicSalary;
private double MonthlySalary;
private double AnnualSalary;
public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public double getBasicSalary() {
	return BasicSalary;
}
public void setBasicSalary(double basicSalary) {
	BasicSalary = basicSalary;
}
public double getMonthlySalary() {
	return MonthlySalary;
}
public void setMonthlySalary(double monthlySalary) {
	MonthlySalary = monthlySalary;
}
public double getAnnualSalary() {
	return AnnualSalary;
}
public void setAnnualSalary(double annualSalary) {
	AnnualSalary = annualSalary;
}
}
