package com.telecom.backend.api.service;

import org.springframework.stereotype.Service;

import com.telecom.backend.api.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Optional<Employee> getEmployeeByEmployeeNumber(int employeeNumber) {
        return employees.stream()
                .filter(employee -> employee.getEmployeeNumber() == employeeNumber)
                .findFirst();
    }

    public Employee createEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee updateEmployee(int employeeNumber, Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getEmployeeNumber() == employeeNumber) {
                employees.set(i, updatedEmployee);
                return updatedEmployee;
            }
        }
        return null;
    }
}
