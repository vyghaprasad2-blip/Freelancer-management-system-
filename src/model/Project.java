package model;

import java.time.LocalDate;

public class Project {

    private int projectId;
    private String title;
    private String description;
    private double budget;
    private LocalDate deadline;
    private String status;
    private Freelancer assignedFreelancer;

    public Project(int projectId, String title,
                   String description, double budget,
                   LocalDate deadline) {
        this.projectId = projectId;
        this.title = title;
        this.description = description;
        this.budget = budget;
        this.deadline = deadline;
        this.status = "Open";
    }

    public int getProjectId() {
        return projectId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getBudget() {
        return budget;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getStatus() {
        return status;
    }

    public Freelancer getAssignedFreelancer() {
        return assignedFreelancer;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void assignFreelancer(Freelancer freelancer) {
        this.assignedFreelancer = freelancer;
        this.status = "Assigned";
    }

    public void displayProject() {
        System.out.println("Project ID: " + projectId);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Budget: " + budget);
        System.out.println("Deadline: " + deadline);
        System.out.println("Status: " + status);

        if (assignedFreelancer != null) {
            System.out.println(
                "Freelancer: " + assignedFreelancer.getName()
            );
        }
    }
}