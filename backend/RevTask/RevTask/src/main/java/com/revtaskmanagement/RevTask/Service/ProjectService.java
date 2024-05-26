package com.revtaskmanagement.RevTask.Service;

import com.revtaskmanagement.RevTask.DTO.ProjectDTO;
import com.revtaskmanagement.RevTask.DTO.TaskDTO;
import com.revtaskmanagement.RevTask.Entity.Client;
import com.revtaskmanagement.RevTask.Entity.Project;
import com.revtaskmanagement.RevTask.Entity.ProjectManager;
import com.revtaskmanagement.RevTask.Exception.ResourceNotFoundException;
import com.revtaskmanagement.RevTask.Repository.ClientRepository;
import com.revtaskmanagement.RevTask.Repository.ProjectManagerRepository;
import com.revtaskmanagement.RevTask.Repository.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ProjectManagerRepository projectManagerRepository;

    @Autowired
    private ClientRepository clientRepository;


    public ProjectDTO getProjectDTOById(Long id) {
        Optional<Project> projectOpt = projectRepository.findById(id);
        if (projectOpt.isPresent()) {
            return mapToDTO(projectOpt.get());
        } else {
            throw new ResourceNotFoundException("Project not found with id: " + id);
        }
    }

    public List<ProjectDTO> getAllProjects() {
        List<Project> projects = projectRepository.findAll();
        return projects.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public void deleteProject(Long id) {
        Project project = projectRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Project not found"));
        projectRepository.delete(project);
    }

    private void validateAndSetReferences(Project project) {
        if (project.getProjectManager() != null) {
            Optional<ProjectManager> pmOpt = projectManagerRepository.findById(project.getProjectManager().getId());
            pmOpt.ifPresent(project::setProjectManager);
        }
        if (project.getClient() != null) {
            Optional<Client> clientOpt = clientRepository.findById(project.getClient().getId());
            clientOpt.ifPresent(project::setClient);
        }
    }

    private ProjectDTO mapToDTO(Project project) {
        List<TaskDTO> taskDetails = project.getTasks().stream()
                .map(task -> new TaskDTO(task.getId(), task.getTitle()))
                .collect(Collectors.toList());

        return new ProjectDTO(
                project.getId(),
                project.getName(),
                project.getDescription(),
                project.getClient().getName(),
                project.getProjectManager().getId(),
                project.getProjectManager().getUsername(),
                taskDetails
        );
    }


    public Project createProject(Project project) {
        validateAndSetReferences(project);
        return projectRepository.save(project);
    }

    public Project updateProject(Long id, Project projectDetails) {
        Optional<Project> projectOpt = projectRepository.findById(id);
        if (projectOpt.isPresent()) {
            Project existingProject = projectOpt.get();
            existingProject.setName(projectDetails.getName());
            existingProject.setDescription(projectDetails.getDescription());
            existingProject.setProjectManager(projectDetails.getProjectManager());
            existingProject.setClient(projectDetails.getClient());
            existingProject.setTeamMembers(projectDetails.getTeamMembers());
            existingProject.setTasks(projectDetails.getTasks());
            validateAndSetReferences(existingProject);
            return projectRepository.save(existingProject);
        } else {
            throw new RuntimeException("Project not found");
        }
    }

}
