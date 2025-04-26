package com.repository;
//import com.model.EmployeeModel;
import com.model.EmployeeDepartment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DepartmentRepository extends JpaRepository<EmployeeDepartment ,Long> {

}
