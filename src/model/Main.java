public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     REBECCA - JAVA PROJECT");
        System.out.println("=================================");

        // 1. Create User
        User user = new User(
                1,
                "Rebecca",
                "rebecca@gmail.com"
        );

        System.out.println("\n--- USER ---");
        user.displayInfo();
        user.displayRole();


        // 2. Create Client
        Client client = new Client(
                2,
                "Anu",
                "anu@gmail.com",
                "ABC Company"
        );

        System.out.println("\n--- CLIENT ---");
        client.displayClientInfo();
        client.displayRole();


        // 3. Create Freelancer
        Freelancer freelancer = new Freelancer(
                3,
                "Maria",
                "maria@gmail.com"
        );

        freelancer.addSkill("Python");
        freelancer.addSkill("Java");
        freelancer.addSkill("Web Development");

        System.out.println("\n--- FREELANCER ---");
        freelancer.displayFreelancerInfo();
        freelancer.displayRole();


        // 4. Create Developer
        Developer developer = new Developer(
                4,
                "John",
                "john@gmail.com",
                "Java"
        );

        developer.addSkill("Java");
        developer.addSkill("Python");
        developer.addSkill("SQL");

        System.out.println("\n--- DEVELOPER ---");
        developer.displayDeveloperInfo();
        developer.displayRole();


        // 5. Create Designer
        Designer designer = new Designer(
                5,
                "Sara",
                "sara@gmail.com",
                "Figma"
        );

        designer.addSkill("UI Design");
        designer.addSkill("UX Design");
        designer.addSkill("Graphic Design");

        System.out.println("\n--- DESIGNER ---");
        designer.displayDesignerInfo();
        designer.displayRole();


        // POLYMORPHISM
        System.out.println("\n--- POLYMORPHISM ---");

        User user1 = new Client(
                6,
                "Alex",
                "alex@gmail.com",
                "XYZ Company"
        );

        User user2 = new Developer(
                7,
                "David",
                "david@gmail.com",
                "Python"
        );

        User user3 = new Designer(
                8,
                "Emma",
                "emma@gmail.com",
                "Photoshop"
        );

        user1.displayRole();
        user2.displayRole();
        user3.displayRole();


        System.out.println("\n=================================");
        System.out.println("       PROGRAM COMPLETED");
        System.out.println("=================================");
    }
}