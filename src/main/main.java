package main;

import model.*;
import service.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ProjectService projectService = new ProjectService();
    private static PaymentService paymentService = new PaymentService();

    private static List<Client> clients = new ArrayList<>();
    private static List<Freelancer> freelancers = new ArrayList<>();
    private static List<Review> reviews = new ArrayList<>();
    private static int userId = 1;
    private static int projectId = 1;
    private static int paymentId = 1;
    private static int reviewId = 1;
    private static int taskId = 1;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== FREELANCER PROJECT MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Client");
            System.out.println("2. Register Freelancer");
            System.out.println("3. View Freelancers");
            System.out.println("4. Create Project");
            System.out.println("5. View Projects");
            System.out.println("6. Assign Freelancer");
            System.out.println("7. Update Project Status");
            System.out.println("8. Add Task");
            System.out.println("9. Make Payment");
            System.out.println("10. View Payments");
            System.out.println("11. Add Review");
            System.out.println("12. View Reviews");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = readInt();

            switch (choice) {
                case 1:
                    registerClient();
                    break;
                case 2:
                    registerFreelancer();
                    break;
                case 3:
                    viewFreelancers();
                    break;
                case 4:
                    createProject();
                    break;
                case 5:
                    projectService.viewProjects();
                    break;
                case 6:
                    assignFreelancer();
                    break;
                case 7:
                    updateProjectStatus();
                    break;
                case 8:
                    addTask();
                    break;
                case 9:
                    makePayment();
                    break;
                case 10:
                    paymentService.viewPayments();
                    break;
                case 11:
                    addReview();
                    break;
                case 12:
                    viewReviews();
                    break;
                case 0:
                    System.out.println("Thank you for using our system!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    private static int readInt() {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }

    private static double readDouble() {
        while (!sc.hasNextDouble()) {
            System.out.print("Please enter a valid amount: ");
            sc.next();
        }
        double value = sc.nextDouble();
        sc.nextLine();
        return value;
    }

    private static void registerClient() {
        System.out.print("Enter client name: ");
        String name = sc.nextLine();

        System.out.print("Enter client email: ");
        String email = sc.nextLine();

        Client client = new Client(userId++, name, email);
        clients.add(client);

        System.out.println("Client registered successfully!");
        client.displayDetails();
    }

    private static void registerFreelancer() {
        System.out.print("Enter freelancer name: ");
        String name = sc.nextLine();

        System.out.print("Enter freelancer email: ");
        String email = sc.nextLine();

        System.out.println("Choose freelancer type:");
        System.out.println("1. Developer");
        System.out.println("2. Designer");
        System.out.println("3. Other Freelancer");
        System.out.print("Choice: ");
        int type = readInt();

        System.out.print("Enter skill: ");
        String skill = sc.nextLine();

        System.out.print("Enter hourly rate: ");
        double rate = readDouble();

        Freelancer freelancer;

        switch (type) {
            case 1:
                freelancer = new Developer(
                    userId++, name, email, rate
                );
                break;
            case 2:
                freelancer = new Designer(
                    userId++, name, email, rate
                );
                break;
            default:
                freelancer = new Freelancer(
                    userId++, name, email, skill, rate
                );
        }

        freelancers.add(freelancer);
        System.out.println("Freelancer registered successfully!");
        freelancer.displayDetails();
    }

    private static void viewFreelancers() {
        if (freelancers.isEmpty()) {
            System.out.println("No freelancers registered yet.");
            return;
        }

        for (Freelancer freelancer : freelancers) {
            freelancer.displayDetails();
            System.out.println("----------------------");
        }
    }

    private static void createProject() {
        System.out.print("Enter project title: ");
        String title = sc.nextLine();

        System.out.print("Enter project description: ");
        String description = sc.nextLine();

        System.out.print("Enter project budget: ");
        double budget = readDouble();

        System.out.print("Enter deadline (YYYY-MM-DD): ");
        String dateText = sc.nextLine();

        try {
            LocalDate deadline = LocalDate.parse(dateText);

            Project project = new Project(
                projectId++, title, description, budget, deadline
            );

            projectService.addProject(project);
        } catch (Exception e) {
            System.out.println("Invalid date. Use YYYY-MM-DD.");
        }
    }

    private static void assignFreelancer() {
        if (freelancers.isEmpty()) {
            System.out.println("Register a freelancer first.");
            return;
        }

        System.out.print("Enter project ID: ");
        int id = readInt();

        viewFreelancers();
        System.out.print("Enter freelancer ID: ");
        int freelancerId = readInt();

        Freelancer selected = null;

        for (Freelancer freelancer : freelancers) {
            if (freelancer.getId() == freelancerId) {
                selected = freelancer;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Freelancer not found.");
            return;
        }

        projectService.assignFreelancer(id, selected);
    }

    private static void updateProjectStatus() {
        System.out.print("Enter project ID: ");
        int id = readInt();

        System.out.println("1. Open");
        System.out.println("2. In Progress");
        System.out.println("3. Completed");
        System.out.print("Choose status: ");
        int option = readInt();

        String status;

        switch (option) {
            case 1:
                status = "Open";
                break;
            case 2:
                status = "In Progress";
                break;
            case 3:
                status = "Completed";
                break;
            default:
                System.out.println("Invalid status choice.");
                return;
        }

        projectService.updateProjectStatus(id, status);
    }

    private static void addTask() {
        System.out.print("Enter task title: ");
        String title = sc.nextLine();

        System.out.print("Enter task description: ");
        String description = sc.nextLine();

        Task task = new Task(taskId++, title, description);

        System.out.println("Task created successfully!");
        task.displayTask();
    }

    private static void makePayment() {
        System.out.print("Enter payment amount: ");
        double amount = readDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        System.out.println("Choose payment method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.print("Choice: ");
        int method = readInt();

        Payment payment;

        if (method == 1) {
            System.out.print("Enter sample UPI ID: ");
            String upiId = sc.nextLine();

            payment = new UPIPayment(paymentId++, amount, upiId);

        } else if (method == 2) {
            System.out.print("Enter cardholder name: ");
            String holder = sc.nextLine();

            System.out.print("Enter last four digits only: ");
            String digits = sc.nextLine();

            payment = new CardPayment(
                paymentId++, amount, holder, digits
            );

        } else {
            System.out.println("Invalid payment method.");
            return;
        }

        paymentService.makePayment(payment);
    }

    private static void addReview() {
        if (freelancers.isEmpty()) {
            System.out.println("Register a freelancer first.");
            return;
        }

        viewFreelancers();

        System.out.print("Enter freelancer ID to review: ");
        int id = readInt();

        Freelancer selected = null;

        for (Freelancer freelancer : freelancers) {
            if (freelancer.getId() == id) {
                selected = freelancer;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Freelancer not found.");
            return;
        }

        System.out.print("Enter rating (1 to 5): ");
        int rating = readInt();

        if (rating < 1 || rating > 5) {
            System.out.println("Rating must be between 1 and 5.");
            return;
        }

        System.out.print("Enter your comment: ");
        String comment = sc.nextLine();

        Review review = new Review(
            reviewId++, rating, comment, selected.getName()
        );

        reviews.add(review);
        System.out.println("Review added successfully!");
    }

    private static void viewReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews available.");
            return;
        }

        for (Review review : reviews) {
            review.displayReview();
            System.out.println("----------------------");
        }
    }
}