package com.lifefitness.interview.controller;

import com.lifefitness.interview.model.Employee;
import com.lifefitness.interview.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

  private EmployeeService employeeService = new EmployeeService();

  @PostMapping("/add")
  public void addEmployee(@RequestParam String name, @RequestParam double salary,
      @RequestParam String type) {
    employeeService.addEmployee(new Employee(name, salary, type));
  }

  @GetMapping("/{name}")
  public Employee getEmployee(@PathVariable String name) {
    return employeeService.getEmployee(name);
  }
}
