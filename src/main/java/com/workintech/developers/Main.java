package com.workintech.developers;

public class Main {
    public static void main(String[] args) {
        HRManager hrManager = new HRManager(1, "John", 5000);

        JuniorDeveloper juniorDev = new JuniorDeveloper(2, "Alice", 3000);
        MidDeveloper midDev = new MidDeveloper(3, "Bob", 4000);
        SeniorDeveloper seniorDev = new SeniorDeveloper(4, "Charlie", 6000);

        hrManager.addEmployee(juniorDev);
        hrManager.addEmployee(midDev);
        hrManager.addEmployee(seniorDev);

        juniorDev.work();
        midDev.work();
        seniorDev.work();

        // Çalışan maaşlarını kontrol etme
        System.out.println(juniorDev.getName() + " new salary: " + juniorDev.getSalary());
        System.out.println(midDev.getName() + " new salary: " + midDev.getSalary());
        System.out.println(seniorDev.getName() + " new salary: " + seniorDev.getSalary());
    }
}
