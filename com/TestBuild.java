package com;

import java.util.Scanner;
import com.DaoImpl.EmpFreshImpl;
import com.DaoImpl.EmpSallmpl;

public class TestBuild {
public static void main(String[] args) {
EmpFreshImpl ef = new EmpFreshImpl();
EmpSallmpl es = new EmpSallmpl();
while (true) {
Scanner s = new Scanner(System.in);
System.out.println("-------------Employee Management System-------------");
System.out.println("Enter Choice");
System.out.println(" 1. Manage Employee Details \n 2. Manage Salary Details \n 3. Exit");
int ch = s.nextInt();	
switch (ch) {
case 1:
Scanner s1 = new Scanner(System.in);
System.out.println("-------------Manage Employee Details-------------");
System.out.println("Enter Choice");
System.out.println(" 1. Create Employee Details \n 2. Update Employee Details \n 3. Delete Employee Details \n 4. Show Employee Details");
int ch1 = s.nextInt();
switch (ch1) {
case 1:
	ef.CreateEmp();	
break;
case 2:
	ef.UpdateEmp();
break;
case 3:
	ef.DeleteEmp();
break;
case 4:
	ef.ShowEmp();
break;	
}
break;
case 2:
Scanner s2 = new Scanner(System.in);
System.out.println("-------------Manage Employee Details-------------");
System.out.println("Enter Choice");
System.out.println(" 1. Create Salary Details \n 2. Update Salary Details \n 3. Delete Salary Details \n 4. Show Salary Details");
int ch2 = s.nextInt();
switch (ch2) {
case 1:
	es.CreateSal();
	break;
case 2:
	es.UpdateSal();
	break;
case 3:
	es.DeleteSal();
	break;
case 4:
	es.ShowSal();
	break;
}
break;
case 3:
System.out.println("Thank You!!!");
System.exit(0);
break;
}
}
}
}
