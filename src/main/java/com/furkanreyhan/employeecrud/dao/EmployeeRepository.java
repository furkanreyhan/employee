package com.furkanreyhan.employeecrud.dao;

import com.furkanreyhan.employeecrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //thats all
}
