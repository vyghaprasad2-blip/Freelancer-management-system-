package model;

public class Designer extends Freelancer {

    public Designer(int id, String name, String email,
                    double hourlyRate) {
        super(id, name, email, "UI/UX Design", hourlyRate);
    }

    @Override
    public String getRole() {
        return "Designer";
    }
}