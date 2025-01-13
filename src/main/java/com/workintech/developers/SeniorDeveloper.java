package com.workintech.developers;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is leading the team as a Senior Developer.");
        this.setSalary(this.getSalary() * 1.15); // Maaşı artırıyoruz
    }
}
