package com.example.provahikari.controlers;

import com.example.provahikari.models.Employee;
import com.example.provahikari.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeControler {


    private EmployeeService employeeService;

    @Autowired
    public EmployeeControler( EmployeeService employeeService ) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> fincAllEmployees(){
        return ResponseEntity.ok(employeeService.findAll());
    }

    @GetMapping("/slowquery")
    public ResponseEntity<Long> slowQuery(){
        return ResponseEntity.ok(employeeService.slowQuery());
    }
}
