/*
 * Create a Spring Boot application that uses Spring MVC to create a REST API. The
	API should accept a JSON request with data and insert it into a MySQL database
	table using JPA and Hibernate. The application should use Spring Data JPA to map
	the table to a Java object and then insert the data into the table
 * 
 * 
 */


package in.ineuron.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Student;
import in.ineuron.service.IStudentService;

@RestController
@RequestMapping("/stud")
public class MyController {
	
	@Autowired
	private IStudentService iStudentService;
	
	@PostMapping(value = "/add")
	public ResponseEntity<String> getStudent(@RequestBody Student student){
		 
		String status = iStudentService.saveStudent(student);
		
		System.out.println(status);
		
		return new ResponseEntity<>(status , HttpStatus.ACCEPTED);
	}
	
	

	@GetMapping(value = "/getAll")
	public ResponseEntity<List<Student>> get(){

		List<Student> allStudent = iStudentService.getAllStudent();
		
		return new ResponseEntity<>(allStudent, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<Student> getSingle(@PathVariable Integer id){
		
		Optional<Student> student = iStudentService.getStudentById(id);
		
		if(student.isPresent())
			return new ResponseEntity<Student>(student.get(), HttpStatus.OK);
		else 
		    return null;
		
		
	}

}
