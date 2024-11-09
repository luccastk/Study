package com.company.employees;

public class FullTimeEmployee extends Employee{
    private double time;

    public FullTimeEmployee(double time) {
        this.time = time;
    }

    @Override
    public double calculateSalary() {
        return time * super.getSalary();
    }
}
