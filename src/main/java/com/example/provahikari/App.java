package com.example.provahikari;

import com.example.provahikari.models.Employee;
import com.example.provahikari.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
@EnableAsync
public class App {


    private EmployeeRepository employeeRepository;

    public App( EmployeeRepository employeeRepository ) {
        this.employeeRepository = employeeRepository;
    }

    public static void main( String[] args ) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);

        //EmployeeRepository employeeRepository = ctx.getBean(EmployeeRepository.class);
        //employeeRepository.save(new Employee("Perico", LocalDateTime.now()));
        //employeeRepository.findAll().forEach(System.out::println);

        App app = new App(ctx.getBean(EmployeeRepository.class));
        app.run();
    }
    @Async
    public void saveEmployeeAndPrint() {
        System.out.printf("--- SAVE:" );
        this.employeeRepository.save(new Employee("Perico", LocalDateTime.now()));
        System.out.printf("--- PRINT:" );
        this.employeeRepository.findFirstByNameOrderByBirthDateDesc("Perico").ifPresent(System.out::println);
    }

    public void simulateConcurrentUsers() {
        for (int i = 0; i < 10000; i++) {
            System.out.printf("**** Volta:" + i);
            saveEmployeeAndPrint();
        }
    }

    public void runExample() {
        ExecutorService executor = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 100; i++) {
            executor.submit(() -> {
                // Access the database using employeeRepository
                // employeeRepository.findAll();
                // employeeRepository.save(new Employee("Perico", LocalDateTime.now()));
                // employeeRepository.findEmployeeWithSleep();
                employeeRepository.slowQuery();
                System.out.println(Thread.currentThread().getName() + " - Accessed the database");
            });
        }

        executor.shutdown();
    }
    public void run() {
        //simulateConcurrentUsers();

        runExample();
    }
}
