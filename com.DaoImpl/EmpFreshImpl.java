package com.DaoImpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.HibernateUtil;
import com.Dao.EmpFreshDao;
import com.Entity.EmployeeFreshers;

public class EmpFreshImpl implements EmpFreshDao {

	@Override
	public void CreateEmp() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Create EmpId :");
		int id = s.nextInt();
		System.out.println("Enter Employee Name :");
		String name = s.next();
		System.out.println("Enter Employee Work Location :");
		String loc = s.next();
		System.out.println("Enter Employee Phone No :");
		long phoneno = s.nextLong();
		System.out.println("Enter Employee Job Title :");
		String job = s.next();
		EmployeeFreshers e = new EmployeeFreshers();
		e.setEmpId(id);
		e.setName(name);
		e.setLocation(loc);
		e.setPhoneNo(phoneno);
		e.setEmpTitle(job);
		session.save(e);
		t.commit();
		System.out.println("Employee record inserted successfully");
		session.close();
		
	}

	@Override
	public void UpdateEmp() {
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter EmpId :");
		int id = s.nextInt();
		EmployeeFreshers f = session.get(EmployeeFreshers.class,id);
		System.out.println("Enter Updated Employee Name :");
		String name = s.next();
		System.out.println("Enter Updated Employee Work Location :");
		String loc = s.next();
		System.out.println("Enter Updated Employee Phone No :");
		long phoneno = s.nextLong();
		System.out.println("Enter Updated Employee Job Title :");
		String job = s.next();
		session.update(f);
		t.commit();
		System.out.println("Employee Record Updated Successfully");
		session.close();
	}

	@Override
	public void DeleteEmp() {
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();	
		System.out.println("Enter EmpId :");
		int id = s.nextInt();
		EmployeeFreshers j = session.get(EmployeeFreshers.class,id);
		session.delete(j);
		t.commit();
		System.out.println("Employee Record Deleted Successfully");
		session.close();
	}

	@Override
	public void ShowEmp() {
		Session session = HibernateUtil.getSessionFactory().openSession();	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter EmpId :");
		int id = s.nextInt();
		EmployeeFreshers k = session.get(EmployeeFreshers.class,id);
		System.out.println(" EmployeeID :"+k.getEmpId()+" EmployeeName :"+k.getName()+
		" Employee Work Location :"+k.getLocation()+" Employee PhoneNo :"+k.getPhoneNo()+
		" EmployeeJob :"+k.getEmpTitle());
	}

}
