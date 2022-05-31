package com.Venkatareddy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	
	}

	@Override
	public List<Employee> getAllEmployessBySorted() {
		
		return employeeRepository.findAll(Sort.by("EmployeeId").descending());
	}

}
