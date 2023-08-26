package com.example.provahikari.repositories;

import com.example.provahikari.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findFirstByNameOrderByBirthDateDesc(String name);

    @Query(value = "SELECT * FROM employees WHERE SLEEP(5) LIMIT 1", nativeQuery = true)
    Employee findEmployeeWithSleep();

    @Query(value = "SELECT  SLEEP(5)", nativeQuery = true)
    Long slowQuery();


}
