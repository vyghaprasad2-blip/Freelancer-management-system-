package model;

public class Developer extends Freelancer {

    public Developer(int id, String name, String email,
                     double hourlyRate) {
        super(id, name, email, "Software Development", hourlyRate);
    }

    @Override
    public String getRole() {
        return "Developer";
    }
}