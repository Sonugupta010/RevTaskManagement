package com.revtaskmanagement.RevTask.Controller;

import com.revtaskmanagement.RevTask.DTO.ProjectManagerDTO;
import com.revtaskmanagement.RevTask.Entity.ProjectManager;
import com.revtaskmanagement.RevTask.Service.ProjectManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project-managers")
public class ProjectManagerController {

    @Autowired
    private ProjectManagerService projectManagerService;

    @GetMapping("/getAllProjects")
    public ResponseEntity<List<ProjectManagerDTO>> getAllProjectManagers() {

        List<ProjectManagerDTO> projectManagers=projectManagerService.getAllProjectManagers();
        if(projectManagers==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(projectManagers,HttpStatus.OK);
    }


    @GetMapping("/getProjectById/{id}")
    public ResponseEntity<ProjectManagerDTO> getProjectManagerById(@PathVariable Long id) {
        ProjectManagerDTO projectManager=projectManagerService.getProjectManagerById(id);
        if(projectManager==null)
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(projectManager,HttpStatus.OK);
    }

    @PostMapping("/create-project-manager")
    public ResponseEntity<ProjectManager> createProjectManager(@RequestBody ProjectManager projectManager) {
        ProjectManager projectManager1 = projectManagerService.createProjectManager(projectManager);
        if(projectManager1==null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(projectManager1,HttpStatus.OK);
        }
    }

    @PutMapping("/updateProject/{id}")
    public ResponseEntity<ProjectManager> updateProjectManager(@PathVariable Long id, @RequestBody ProjectManager projectManagerDetails) {
        if(projectManagerDetails==null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        ProjectManager projectManager= projectManagerService.updateProjectManager(id,projectManagerDetails);
        return new ResponseEntity<>(projectManager,HttpStatus.OK);
    }

//    @DeleteMapping("/deleteProject/{id}")
//    public void deleteProjectManager(@PathVariable Long id) {
//        projectManagerService.deleteProjectManager(id);
//    }
}
