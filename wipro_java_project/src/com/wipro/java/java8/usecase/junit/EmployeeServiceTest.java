package com.wipro.java.java8.usecase.junit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeServiceTest {

    private EmployeeService service;

    // Employee class
    static class Employee {
        private int empId;
        private String empName;
        private String department;
        private double salary;
        private LocalDate joiningDate;

        public Employee(int empId, String empName, String department, double salary, LocalDate joiningDate) {
            this.empId = empId;
            this.empName = empName;
            this.department = department;
            this.salary = salary;
            this.joiningDate = joiningDate;
        }

        public int getEmpId() { return empId; }
        public String getEmpName() { return empName; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }
        public void setSalary(double salary) { this.salary = salary; }
    }

    // EmployeeService class
    static class EmployeeService {
        private final Map<Integer, Employee> employeeMap = new HashMap<>();

        public void addEmployee(Employee employee) {
            employeeMap.put(employee.getEmpId(), employee);
        }

        public void removeEmployee(int empId) {
            employeeMap.remove(empId);
        }

        public Optional<Employee> searchEmployee(int empId) {
            return Optional.ofNullable(employeeMap.get(empId));
        }

        public void updateSalary(int empId, double newSalary) {
            Employee employee = employeeMap.get(empId);
            if (employee != null) {
                employee.setSalary(newSalary);
            }
        }

        // New method: Filter employees by department
        public List<Employee> filterByDepartment(String department) {
            return employeeMap.values().stream()
                    .filter(e -> e.getDepartment().equalsIgnoreCase(department))
                    .collect(Collectors.toList());
        }

        // New method: Sort employees by name
        public List<Employee> sortByName() {
            return employeeMap.values().stream()
                    .sorted(Comparator.comparing(Employee::getEmpName))
                    .collect(Collectors.toList());
        }

        // New method: Calculate average salary
        public double getAverageSalary() {
            return employeeMap.values().stream()
                    .mapToDouble(Employee::getSalary)
                    .average()
                    .orElse(0.0);
        }
    }

    // Setting up EmployeeService before each test
    @Before
    public void setUp() {
        service = new EmployeeService();
        service.addEmployee(new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10)));
        service.addEmployee(new Employee(2, "Bob", "HR", 60000, LocalDate.of(2021, 7, 15)));
        service.addEmployee(new Employee(3, "Charlie", "IT", 70000, LocalDate.of(2019, 4, 20)));
    }

    @Test
    public void testAddEmployee() {
        service.addEmployee(new Employee(4, "David", "Finance", 65000, LocalDate.of(2022, 3, 5)));
        assertTrue(service.searchEmployee(4).isPresent());
        assertEquals("David", service.searchEmployee(4).get().getEmpName());
    }

    @Test
    public void testRemoveEmployee() {
        service.removeEmployee(1);
        assertFalse(service.searchEmployee(1).isPresent());
    }

    @Test
    public void testSearchEmployee() {
        Optional<Employee> result = service.searchEmployee(1);
        assertTrue(result.isPresent());
        assertEquals("Alice", result.get().getEmpName());
    }

    @Test
    public void testUpdateSalary() {
        service.updateSalary(1, 60000);
        Optional<Employee> result = service.searchEmployee(1);
        assertTrue(result.isPresent());
        assertEquals(60000, result.get().getSalary(), 0.01);
    }

    @Test
    public void testFilterByDepartment() {
        List<Employee> itEmployees = service.filterByDepartment("IT");
        assertEquals(2, itEmployees.size());
        assertEquals("Alice", itEmployees.get(0).getEmpName());
        assertEquals("Charlie", itEmployees.get(1).getEmpName());
    }

    @Test
    public void testSortByName() {
        List<Employee> sortedEmployees = service.sortByName();
        assertEquals("Alice", sortedEmployees.get(0).getEmpName());
        assertEquals("Bob", sortedEmployees.get(1).getEmpName());
        assertEquals("Charlie", sortedEmployees.get(2).getEmpName());
    }

    @Test
    public void testGetAverageSalary() {
        double avgSalary = service.getAverageSalary();
        assertEquals(60000, avgSalary, 0.01);
    }
}
