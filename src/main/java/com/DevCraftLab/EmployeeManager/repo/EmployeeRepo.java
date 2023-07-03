package com.DevCraftLab.EmployeeManager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevCraftLab.EmployeeManager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeByID(Long id);

    Optional<Employee> findEmployeeById(Long id);
    
   
}
