package com.workintech.developers;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is writing code as a Junior Developer.");
        this.setSalary(this.getSalary() * 1.05); // Maaşı artırıyoruz
    }
}
