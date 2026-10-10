package model;

public class Task {

    private int taskId;
    private String title;
    private String description;
    private String status;

    public Task(int taskId, String title, String description) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.status = "Pending";
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayTask() {
        System.out.println("Task ID: " + taskId);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
    }
}