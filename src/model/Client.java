public class Client extends User {

    private String companyName;

    public Client(int id, String name, String email, String companyName) {
        super(id, name, email);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Client");
    }

    public void displayClientInfo() {
        displayInfo();
        System.out.println("Company: " + companyName);
    }
}