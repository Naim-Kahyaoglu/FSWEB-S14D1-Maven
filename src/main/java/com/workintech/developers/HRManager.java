package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[5];
    private MidDeveloper[] midDevelopers = new MidDeveloper[5];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[5];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    // Çalışan ekleme metodları
    public void addEmployee(JuniorDeveloper jd) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = jd;
                return;
            }
        }
        System.out.println("Junior Developer array is full. Could not add.");
    }

    public void addEmployee(MidDeveloper md) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = md;
                return;
            }
        }
        System.out.println("Mid Developer array is full. Could not add.");
    }

    public void addEmployee(SeniorDeveloper sd) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = sd;
                return;
            }
        }
        System.out.println("Senior Developer array is full. Could not add.");
    }
}
