package com.revtaskmanagement.RevTask.Controller;

import com.revtaskmanagement.RevTask.DTO.ProjectDTO;
import com.revtaskmanagement.RevTask.Entity.Project;
import com.revtaskmanagement.RevTask.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<ProjectDTO> getAllProjects() {

        return projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public ProjectDTO getProjectById(@PathVariable Long id) {
        return projectService.getProjectDTOById(id);
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {

        return projectService.createProject(project);
    }

//    @PutMapping("/{id}")
//    public Project updateProject(@PathVariable Long id, @RequestBody Project projectDetails) {
//        return projectService.updateProject(id, projectDetails);
//    }

   @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {

        projectService.deleteProject(id);
    }
}
