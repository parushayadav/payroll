package com.manticore.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.manticore.payroll.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}