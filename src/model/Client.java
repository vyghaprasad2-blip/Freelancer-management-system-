package model;

public class Client extends User {

    public Client(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "Client";
    }
}