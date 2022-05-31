package com.Venkatareddy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "Employee Added Sucessfully";
	}
	@GetMapping("/AllEmployees")
	public List<Employee> getEmployees(){
		return employeeService.getAllEmployees();	
	}
	@GetMapping("/AllEmployees/Sorted")
	public List<Employee> getEmployeesBySorted(){
		return employeeService.getAllEmployessBySorted();
	}

}
