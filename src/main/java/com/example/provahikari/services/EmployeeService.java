package com.example.provahikari.services;

import com.example.provahikari.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {

    List<Employee>  findAll();
    Optional<Employee> findFirstByNameOrderByBirthDateDesc(String employeeName);
    Optional<Employee> findById(Long id);

    Employee save(Employee employee);

    void deleteById(Long id);
    void deleteAll();

    //--- Altres
    Employee findEmployeeWithSleep();

    Long slowQuery();
}
