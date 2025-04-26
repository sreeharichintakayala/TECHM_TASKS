package com.service;

import com.model.EmployeeDepartment;
import com.model.EmployeeModel;
import com.repository.EmployeeRepository;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService {
	private final EmployeeRepository repository;
	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}
	public List<EmployeeModel> findAll(){
		return repository.findAll();
	}
	public Optional<EmployeeModel> findById(Long id){
		return repository.findById(id);
	}
	public EmployeeModel save(EmployeeModel emp) {
		return repository.save(emp);
	}
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
