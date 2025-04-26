package com.controller;

import com.model.EmployeeModel;
import com.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	private final EmployeeService service;
	public EmployeeController(EmployeeService service) {
		this.service = service;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeModel> getEmployee(@PathVariable Long id){
		return service.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public EmployeeModel createEmployee(@RequestBody EmployeeModel employee) {
		return service.save(employee);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<EmployeeModel> updateEmployee(@PathVariable Long id,@RequestBody EmployeeModel emp ){
		return service.findById(id).map(existing -> {
			emp.setId(id);
			return ResponseEntity.ok(service.save(emp));
		}).orElse(ResponseEntity.notFound().build());
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
		if(service.findById(id).isPresent()) {
			service.delete(id);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}
