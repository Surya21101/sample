package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="employee_freshers")
@Entity
public class EmployeeFreshers {
@Id
private int EmpId;
private String Name;
private String Location;
private long PhoneNo;
private String EmpTitle;
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
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public long getPhoneNo() {
	return PhoneNo;
}
public void setPhoneNo(long phoneNo) {
	PhoneNo = phoneNo;
}
public String getEmpTitle() {
	return EmpTitle;
}
public void setEmpTitle(String empTitle) {
	EmpTitle = empTitle;
}
}
