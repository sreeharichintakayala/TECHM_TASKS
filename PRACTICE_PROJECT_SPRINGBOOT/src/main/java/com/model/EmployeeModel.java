package com.model;
import jakarta.persistence.*;


@Entity
public class EmployeeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	private String phone;
	private Double salary;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private EmployeeDepartment department;
	EmployeeModel(Long id,String name,String email,String phone,Double salary){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
		
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
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getSalary() {
		return this.salary;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return this.phone;
	}
	
}
