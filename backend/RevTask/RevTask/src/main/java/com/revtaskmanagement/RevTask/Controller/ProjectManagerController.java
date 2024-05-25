package com.revtaskmanagement.RevTask.Controller;

import com.revtaskmanagement.RevTask.Entity.ProjectManager;
import com.revtaskmanagement.RevTask.Service.ProjectManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project-managers")
public class ProjectManagerController {

    @Autowired
    private ProjectManagerService projectManagerService;

    @GetMapping
    public List<ProjectManager> getAllProjectManagers() {
        return projectManagerService.getAllProjectManagers();
    }

    @GetMapping("/{id}")
    public ProjectManager getProjectManagerById(@PathVariable Long id) {
        return projectManagerService.getProjectManagerById(id);
    }

    @PostMapping
    public ProjectManager createProjectManager(@RequestBody ProjectManager projectManager) {
        return projectManagerService.createProjectManager(projectManager);
    }

    @PutMapping("/{id}")
    public ProjectManager updateProjectManager(@PathVariable Long id, @RequestBody ProjectManager projectManagerDetails) {
        return projectManagerService.updateProjectManager(id, projectManagerDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteProjectManager(@PathVariable Long id) {
        projectManagerService.deleteProjectManager(id);
    }
}
