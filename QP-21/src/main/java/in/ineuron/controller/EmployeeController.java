package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.ineuron.model.Employee;
import in.ineuron.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;

	
	public void registerEmployee() {
		
		Employee employee = new Employee();
		 
		employee.setName("Rakesh");
		employee.setLastName("Pawar");
		employee.setUnit("IOT");
		
		Integer id = service.registerEmployee(employee);
		
		if (id!=null) {
			System.out.println("Employee Registraytion Successfully with id :: "+id);
		}else {
			System.out.println("Failed to Register");
		}
		
		
		
	}
	
	
}
