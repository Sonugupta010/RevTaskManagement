package com.revtaskmanagement.RevTask.Service;

import com.revtaskmanagement.RevTask.DTO.ProjectManagerDTO;
import com.revtaskmanagement.RevTask.Entity.ProjectManager;
import com.revtaskmanagement.RevTask.Repository.ProjectManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectManagerService {
    @Autowired
    private ProjectManagerRepository projectManagerRepository;

    public List<ProjectManagerDTO> getAllProjectManagers() {


        return projectManagerRepository.findAllProjectManagersDTO();

    }

    public ProjectManagerDTO getProjectManagerById(Long id) {

        return projectManagerRepository.findProjectManagerByIdDTO(id);


    }

    public ProjectManager createProjectManager(ProjectManager projectManager) {
        return projectManagerRepository.save(projectManager);
    }

    public ProjectManager updateProjectManager(Long id, ProjectManager projectManagerDetails) {
        ProjectManager projectManager = projectManagerRepository.findById(id).orElseThrow();
        projectManager.setUsername(projectManagerDetails.getUsername());
        projectManager.setPassword(projectManagerDetails.getPassword());
        projectManager.setEmail(projectManagerDetails.getEmail());
        return projectManagerRepository.save(projectManager);
    }




}
