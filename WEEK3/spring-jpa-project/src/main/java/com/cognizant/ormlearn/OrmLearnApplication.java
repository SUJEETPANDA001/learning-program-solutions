package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.*;
import com.cognizant.ormlearn.repository.*;
import com.cognizant.ormlearn.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {
    private static CountryRepository countryRepository;
    private static StockRepository stockRepository;
    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService;
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        
        countryRepository = context.getBean(CountryRepository.class);
        stockRepository = context.getBean(StockRepository.class);
        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);
        skillService = context.getBean(SkillService.class);
        
        testCountryQueries();
        testStockQueries();
        testEmployeeOperations();
    }
    
    private static void testCountryQueries() {
        System.out.println("\n=== Countries containing 'ou' ===");
        List<Country> countries = countryRepository.findByNameContainingIgnoreCase("ou");
        countries.forEach(System.out::println);
        
        System.out.println("\n=== Countries containing 'ou' (sorted) ===");
        countries = countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc("ou");
        countries.forEach(System.out::println);
        
        System.out.println("\n=== Countries starting with 'Z' ===");
        countries = countryRepository.findByNameStartingWith('Z');
        countries.forEach(System.out::println);
    }
    
    private static void testStockQueries() throws Exception {
        System.out.println("\n=== FB Stocks in Sep 2019 ===");
        List<Stock> stocks = stockRepository.findByCodeAndDateBetween(
            "FB", 
            sdf.parse("2019-09-01"), 
            sdf.parse("2019-09-30")
        );
        stocks.forEach(System.out::println);
        
        System.out.println("\n=== Google stocks > 1250 ===");
        stocks = stockRepository.findByCodeAndCloseGreaterThan("GOOGL", 1250);
        stocks.forEach(System.out::println);
        
        System.out.println("\n=== Top 3 volumes ===");
        stocks = stockRepository.findTop3ByOrderByVolumeDesc();
        stocks.forEach(System.out::println);
        
        System.out.println("\n=== 3 Lowest NFLX stocks ===");
        stocks = stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX");
        stocks.forEach(System.out::println);
    }
    
    private static void testEmployeeOperations() {
        System.out.println("\n=== Get Employee with Department and Skills ===");
        Employee employee = employeeService.get(1);
        System.out.println("Employee: " + employee);
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Skills: " + employee.getSkillList());
        
        System.out.println("\n=== Add New Employee ===");
        Employee newEmp = new Employee();
        newEmp.setName("John Doe");
        newEmp.setSalary(50000);
        newEmp.setPermanent(true);
        newEmp.setDateOfBirth(new Date(90, 0, 1)); // Jan 1, 1990
        newEmp.setDepartment(departmentService.get(1));
        employeeService.save(newEmp);
        System.out.println("Added: " + newEmp);
        
        System.out.println("\n=== Update Employee ===");
        employee = employeeService.get(1);
        employee.setDepartment(departmentService.get(2));
        employeeService.save(employee);
        System.out.println("Updated: " + employee);
        
        System.out.println("\n=== Get Department with Employees ===");
        Department dept = departmentService.get(1);
        System.out.println("Department: " + dept.getName());
        dept.getEmployeeList().forEach(e -> System.out.println(" - " + e.getName()));
        
        System.out.println("\n=== Add Skill to Employee ===");
        employee = employeeService.get(1);
        Skill skill = skillService.get(3);
        employee.getSkillList().add(skill);
        employeeService.save(employee);
        System.out.println("Added skill: " + skill.getName() + " to " + employee.getName());
    }
}