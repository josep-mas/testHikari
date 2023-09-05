package com.example.provahikari;

import com.example.provahikari.models.Employee;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HoFroTest {

    @Test
    public void findUniqueFirstLastNames(){
        Set<Employee> employees = Set.of( new Employee("John", "NickJohn", "AS12234"),
                new Employee("Pau", "NickPau", "PAU12234")
        );

        assertEquals(Set.of("John", "Pau"), employees.stream().map(Employee::getName).collect(Collectors.toSet()));

    }

}
