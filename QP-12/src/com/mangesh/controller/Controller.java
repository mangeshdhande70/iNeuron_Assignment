/*
 *  Write a Java program that uses JDBC to implement a simple CRUD (create, read,
	update, delete) application. The program should allow users to add, view, update,
	and delete records in a MySQL database table.

 * 
 */


package com.mangesh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.mangesh.ServiceFactory.EmployeeServiceFactory;
import com.mangesh.dto.Employee;
import com.mangesh.service.IEmployeeService;
import com.mangesh.studentfactory.EmployeeFactory;

public class Controller {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println();
			System.out.println("1. CREATE");
			System.out.println("2. READ");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("5. AllEmployee");
			System.out.println("6. EXIT");

			System.out.println("Select your choice PRESS[1/2/3/4/5]");
			int option = scanner.nextInt();

			switch (option) {

			case 1:
				insertionOperation(scanner);
				break;
			case 2:
				selectOperation(scanner);
				break;
			case 3:
				updateOperation(scanner);
				break;
			case 4:
				deleteOpearation(scanner);
				break;
			case 5:
				getAllEmployee();
				break;
			case 6:
				System.out.println("**** THANK YOU FOR USING OUR APPLICATION ********");
				System.exit(0);
			default:
				System.out.println("YOU PRESS WRONG KEY");
			}

		}

	}

	private static void insertionOperation(Scanner scanner) {

		IEmployeeService iEmployeeService = EmployeeServiceFactory.getEmployeeService();

		String msg = "";

		Employee employee = EmployeeFactory.getEmployee();

		System.out.println("Enter Your Name");
		employee.setName(scanner.next());

		System.out.println("Enter Your Unit");
		employee.setUnit(scanner.next());

		System.out.println("Enter Date Of Joining in (dd-MM-yyyy) format");
		employee.setDoj(scanner.next());

		System.out.println("Enter Date Of Birth in (yyyy-MM-dd) format");
		employee.setDob(scanner.next());

		System.out.println("Select Profile Photo");
		employee.setPhotoPath(scanner.next());

		System.out.println("Select Id Proof");
		employee.setIdProofPath(scanner.next());

		msg = iEmployeeService.addingEmployee(employee.getName(), employee.getUnit(), employee.getDoj(),
				employee.getDob(), employee.getPhotoPath(), employee.getIdProofPath());

		if (msg.equalsIgnoreCase("success"))
			System.out.println("record inserted succesfully");
		else
			System.out.println("record insertion failed....");

//		    scanner.close();

	}

	// For Updating Student Details

	private static void updateOperation(Scanner scanner) throws NumberFormatException, IOException {

		String msg = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Student id to want you update");
		int id = Integer.parseInt(br.readLine());

		IEmployeeService iStudentService = EmployeeServiceFactory.getEmployeeService();

		Employee employee = iStudentService.searchEmployeeById(id);

		Employee newEmployee = EmployeeFactory.getEmployee();

		if (employee.getEmpid() != null) {

			System.out.println("your Old Date of Joining is :: " + employee.getDoj());
			System.out.println("Enter new Date Of Joining in (dd-MM-yyyy) format");
			String doj = br.readLine();

			if (doj.equals("") || doj == "") {
				newEmployee.setDoj(employee.getDoj());
			} else {
				newEmployee.setDoj(doj);
			}

			System.out.println("your Date of Birth is :: " + employee.getDob());
			System.out.println("Enter updated Date Of Birth in (yyyy-MM-dd) format");
			String dob = br.readLine();

			if (dob.equals("") || dob == "") {

				newEmployee.setDob(employee.getDob());
			} else {
				newEmployee.setDob(dob);
			}

			System.out.println("Select Profile Photo");
			String photoPath = br.readLine();
			newEmployee.setPhotoPath(photoPath);

			System.out.println("Select Id Proof");
			String filepath = br.readLine();
			newEmployee.setIdProofPath(filepath);

			newEmployee.setEmpid(employee.getEmpid());

			msg = iStudentService.updateEmployee(newEmployee);

			if (msg.equalsIgnoreCase("success"))
				System.out.println("record updated Successfully......");
			else
				System.out.println("record updation failed......");
		}else {
			System.out.println("Record not found for given id "+id);
		}
	}
	
	
	
	

	private static void selectOperation(Scanner scanner) {

		IEmployeeService iEmployeeService = EmployeeServiceFactory.getEmployeeService();

		System.out.println("Enter Your Id");
		int id = scanner.nextInt();
		Employee employee = iEmployeeService.searchEmployeeById(id);


		if (employee.getEmpid() != null) {

			System.out.println("Employee Id\tEmployee Name\tUNit\tDOJ\tDOB");
			System.out.print(employee.getEmpid() + "\t" + employee.getName() + "\t" + employee.getUnit() + "\t"
					+ employee.getDoj() + "\t" + employee.getDob());

			System.out.println();
			System.out.println(employee.getPhotoPath() + "\t");
			System.out.print(employee.getIdProofPath() + "\t");

		}else {
			System.out.println("Record Not Found For given id :: " + id);
		}

	}

	private static void deleteOpearation(Scanner scanner) {

		String msg = "";
		IEmployeeService iEmployeeService = EmployeeServiceFactory.getEmployeeService();
//		Scanner scanner =new Scanner(System.in);

		System.out.println("Enter Your Id");
		int id = scanner.nextInt();

		msg = iEmployeeService.deleteEmployee(id);

		if (msg.equalsIgnoreCase("success"))
			System.out.println("your data deleted successfulyy");
		else if (msg.equalsIgnoreCase("not found"))
			System.out.println("Record not available for given Id " + id);
		else
			System.out.println("failed to delete your data");

	}

	private static void getAllEmployee() {

		IEmployeeService iEmployeeService = EmployeeServiceFactory.getEmployeeService();

		List<Employee> list = iEmployeeService.getAllEmployee();

		if (list != null) {

			System.out.println(" Id\tEmployee Name\t   Unit \t  DOJ \t\t   DOB");

			// Using While Iterate the result

			Iterator<Employee> iterator = list.iterator();

			while (iterator.hasNext()) {
				Employee employee = (Employee) iterator.next();
				System.out.println(" " + employee.getEmpid() + "\t    " + employee.getName() + "\t   "
						+ employee.getUnit() + "\t\t" + employee.getDoj() + "\t" + employee.getDob());

			}

			System.out.println("\n\n");

			// Using For each

			for (Iterator<Employee> iterator2 = list.iterator(); iterator2.hasNext();) {
				Employee employee = (Employee) iterator2.next();
				System.out.println(" " + employee.getEmpid() + "\t    " + employee.getName() + "\t   "
						+ employee.getUnit() + "\t\t" + employee.getDoj() + "\t" + employee.getDob());
			}

		} else {
			System.out.println("Record not available..............");
		}

	}

}
