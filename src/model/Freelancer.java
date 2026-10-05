import java.util.ArrayList;

public class Freelancer extends User {

    private ArrayList<String> skills;

    public Freelancer(int id, String name, String email) {
        super(id, name, email);
        skills = new ArrayList<>();
    }

    // Add a skill
    public void addSkill(String skill) {
        skills.add(skill);
    }

    // Get skills
    public ArrayList<String> getSkills() {
        return skills;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Freelancer");
    }

    public void displayFreelancerInfo() {
        displayInfo();

        System.out.println("Skills:");

        for (String skill : skills) {
            System.out.println("- " + skill);
        }
    }
}