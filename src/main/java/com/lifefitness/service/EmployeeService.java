package com.lifefitness.service;

import com.lifefitness.interview.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {

  private Map<String, Employee> employeeMap = new HashMap<>();

  public void addEmployee(Employee employee) {
    employeeMap.put(employee.getName(), employee);
  }

  public Employee getEmployee(String name) {
    return employeeMap.get(name);
  }
}
