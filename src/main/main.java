package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   FREELANCER PROJECT MANAGEMENT");
        System.out.println("====================================");

        System.out.println("1. Client");
        System.out.println("2. Freelancer");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // CLIENT MENU
        if (choice == 1) {

            System.out.println("\n----- CLIENT MENU -----");
            System.out.println("1. Create Project");
            System.out.println("2. View Projects");
            System.out.println("3. Hire Freelancer");
            System.out.println("4. Make Payment");
            System.out.println("5. Give Review");
            System.out.println("6. Back");

            System.out.print("Enter your choice: ");
            int clientChoice = sc.nextInt();

            if (clientChoice == 1) {
                System.out.println("Create Project selected.");
            }
            else if (clientChoice == 2) {
                System.out.println("View Projects selected.");
            }
            else if (clientChoice == 3) {
                System.out.println("Hire Freelancer selected.");
            }
            else if (clientChoice == 4) {
                System.out.println("Make Payment selected.");
            }
            else if (clientChoice == 5) {
                System.out.println("Give Review selected.");
            }
            else if (clientChoice == 6) {
                System.out.println("Going back...");
            }
            else {
                System.out.println("Invalid choice.");
            }
        }

        // FREELANCER MENU
        else if (choice == 2) {

            System.out.println("\n----- FREELANCER MENU -----");
            System.out.println("1. Create Profile");
            System.out.println("2. Add Skills");
            System.out.println("3. View Projects");
            System.out.println("4. Accept Project");
            System.out.println("5. Update Progress");
            System.out.println("6. Submit Work");
            System.out.println("7. Back");

            System.out.print("Enter your choice: ");
            int freelancerChoice = sc.nextInt();

            if (freelancerChoice == 1) {
                System.out.println("Create Profile selected.");
            }
            else if (freelancerChoice == 2) {
                System.out.println("Add Skills selected.");
            }
            else if (freelancerChoice == 3) {
                System.out.println("View Projects selected.");
            }
            else if (freelancerChoice == 4) {
                System.out.println("Accept Project selected.");
            }
            else if (freelancerChoice == 5) {
                System.out.println("Update Progress selected.");
            }
            else if (freelancerChoice == 6) {
                System.out.println("Submit Work selected.");
            }
            else if (freelancerChoice == 7) {
                System.out.println("Going back...");
            }
            else {
                System.out.println("Invalid choice.");
            }
        }

        // EXIT
        else if (choice == 3) {
            System.out.println("Thank you!");
        }

        // INVALID CHOICE
        else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}