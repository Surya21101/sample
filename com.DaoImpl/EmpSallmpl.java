package com.DaoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HibernateUtil;
import com.Dao.EmpSalDao;
import com.Entity.EmployeeSalaries;

public class EmpSallmpl implements EmpSalDao {

	@Override
	public void CreateSal() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter EmpId :");
		int id = s.nextInt();
		System.out.println("Enter Employee Name :");
		String name = s.next();
		System.out.println("Enter Basic Salary :");
		double b = s.nextDouble();
		System.out.println("Enter Monthly Salary :");
		double m = s.nextDouble();
		double annual = m*12;
		EmployeeSalaries e = new EmployeeSalaries();
		e.setEmpId(id);
		e.setName(name);
		e.setBasicSalary(b);
		e.setMonthlySalary(m);
		e.setAnnualSalary(annual);
		session.save(e);
		t.commit();
		System.out.println("Employee salary Record Inserted Successfully");
		session.close();
	}

	@Override
	public void UpdateSal() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter EmpId :");
		int id = s.nextInt();
		EmployeeSalaries f = session.get(EmployeeSalaries.class,id);
		System.out.println("Enter Updated Employee Name :");
		String uname = s.next();
		System.out.println("Enter Updated Basic Salary :");
		double ub = s.nextDouble();
		System.out.println("Enter Updated Monthly Salary :");
		double um = s.nextDouble();
		double uannual = um*12;
		f.setName(uname);
		f.setBasicSalary(ub);
		f.setMonthlySalary(um);
		f.setAnnualSalary(uannual);
		session.update(f);
		t.commit();
		System.out.println("Employee Salary Record Updated Successfully");
		session.close();	
	}

	@Override
	public void DeleteSal() {
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();	
		System.out.println("Enter EmpId :");
		int id = s.nextInt();
		EmployeeSalaries j = session.get(EmployeeSalaries.class,id);
		session.delete(j);
		t.commit();
		System.out.println("Employee Salary Record Deleted Successfully");
		session.close();
	}

	@Override
	public void ShowSal() {
		Session session = HibernateUtil.getSessionFactory().openSession();	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter EmpId :");
		int id = s.nextInt();
		EmployeeSalaries k = session.get(EmployeeSalaries.class,id);
		System.out.println(" EmployeeID :"+k.getEmpId()+" EmployeeName :"+k.getName()+
		" Employee Basic Salary :"+k.getBasicSalary()+" Employee Monthly Salary :"+k.getMonthlySalary()+
		" Employee Annual Salary :"+k.getAnnualSalary());
		
	}

}
