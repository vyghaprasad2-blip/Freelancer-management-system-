package model;

public class Freelancer extends User {

    private String skill;
    private double hourlyRate;

    public Freelancer(int id, String name, String email,
                      String skill, double hourlyRate) {
        super(id, name, email);
        this.skill = skill;
        this.hourlyRate = hourlyRate;
    }

    public String getSkill() {
        return skill;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public String getRole() {
        return "Freelancer";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Skill: " + skill);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}