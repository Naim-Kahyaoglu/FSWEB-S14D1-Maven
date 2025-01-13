package com.workintech.developers;

public class MidDeveloper extends Employee {

    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is developing features as a Mid Developer.");
        this.setSalary(this.getSalary() * 1.10); // Maaşı artırıyoruz
    }
}
