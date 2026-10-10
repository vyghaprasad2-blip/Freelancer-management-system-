package service;

import model.Project;
import model.Freelancer;
import java.util.ArrayList;
import java.util.List;

public class ProjectService {

    private List<Project> projects = new ArrayList<>();

    public void addProject(Project project) {
        projects.add(project);
        System.out.println("Project created successfully!");
    }

    public void viewProjects() {
        if (projects.isEmpty()) {
            System.out.println("No projects available.");
            return;
        }

        for (Project project : projects) {
            project.displayProject();
            System.out.println("----------------------");
        }
    }

    public Project findProject(int projectId) {
        for (Project project : projects) {
            if (project.getProjectId() == projectId) {
                return project;
            }
        }
        return null;
    }

    public void assignFreelancer(int projectId, Freelancer freelancer) {
        Project project = findProject(projectId);

        if (project == null) {
            System.out.println("Project not found.");
            return;
        }

        if (project.getAssignedFreelancer() != null) {
            System.out.println("A freelancer is already assigned.");
            return;
        }

        project.assignFreelancer(freelancer);
        System.out.println("Freelancer assigned successfully!");
    }

    public void updateProjectStatus(int projectId, String status) {
        Project project = findProject(projectId);

        if (project == null) {
            System.out.println("Project not found.");
            return;
        }

        project.setStatus(status);
        System.out.println("Project status updated!");
    }
}