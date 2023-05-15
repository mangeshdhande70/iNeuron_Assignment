package com.mangesh.controller;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mangesh.model.Employee;
import com.mangesh.util.HibernateUtil;

public class Update {

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		Transaction transaction = null;
		Employee employee = null;
		
		System.out.println("Enter Employee id for updataion");
		int id = scanner.nextInt();

		try {
			Session session = HibernateUtil.getSession();

			if (session != null) {
				employee = session.get(Employee.class, id);
				System.out.println("Before Updation");
				System.out.println(employee);
			}

			if (employee != null) {
				transaction = session.beginTransaction();

				employee.setEmpolyeeName("AKash");
				employee.setExperience(2);
				
				session.update(employee);
				
			}else {
				System.out.println("Record Not Found For given id ");
				return;
			}
			
			System.out.println("After Updataion");
			Employee employee2 = session.get(Employee.class, id);
			System.out.println(employee2);
			
		   	
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (transaction != null)
				transaction.commit();

			HibernateUtil.closeSession(null);
			HibernateUtil.closeSessionFactory();

		}
	}

}
