package com.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class EmployeeDepartment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany(mappedBy = "department")
	private List<EmployeeModel> employees;
	EmployeeDepartment(Long id,String name){
		this.id = id;
		this.name = name;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
