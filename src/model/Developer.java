public class Developer extends Freelancer {

    private String programmingLanguage;

    public Developer(int id, String name, String email, String programmingLanguage) {
        super(id, name, email);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Developer");
    }

    public void displayDeveloperInfo() {
        displayFreelancerInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}