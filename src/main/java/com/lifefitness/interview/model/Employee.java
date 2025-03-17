package com.lifefitness.interview.model;

public class Employee {

  private String name;
  private double salary;
  private String type;

  public Employee(String name, double salary, String type) {
    this.name = name;
    this.salary = salary;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public double calculateBonus() {
    if (type.equals("Manager")) {
      return salary * 0.20;
    } else if (type.equals("Developer")) {
      return salary * 0.10;
    } else {
      return 0; // Hint: Bad design: Hardcoded logic
    }
  }
}
