package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("  FREELANCER PROJECT MANAGEMENT");
        System.out.println("====================================");

        System.out.println("1. Client");
        System.out.println("2. Freelancer");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Client selected.");
        } 
        else if (choice == 2) {
            System.out.println("Freelancer selected.");
        } 
        else if (choice == 3) {
            System.out.println("Thank you!");
        } 
        else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}