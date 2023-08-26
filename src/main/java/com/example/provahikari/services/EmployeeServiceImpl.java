package com.example.provahikari.services;

import com.example.provahikari.models.Employee;
import com.example.provahikari.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl( EmployeeRepository employeeRepository ) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findFirstByNameOrderByBirthDateDesc( String employeeName ) {
        return employeeRepository.findFirstByNameOrderByBirthDateDesc( employeeName );
    }

    @Override
    public Optional<Employee> findById( Long id ) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee save( Employee employee ) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById( Long id ) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        employeeRepository.deleteAll();
    }

    @Override
    public Employee findEmployeeWithSleep() {
        return employeeRepository.findEmployeeWithSleep();
    }

    @Override
    public Long slowQuery() {
        return employeeRepository.slowQuery();
    }
}
