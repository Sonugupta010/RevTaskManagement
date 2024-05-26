package com.revtaskmanagement.RevTask.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class ProjectDTO {
        private Long projectId;
        private String projectName;
        private String projectDescription;
        private String clientName;
        private Long projectManagerId;
        private String projectManagerName;
        private List<TaskDTO> taskNames;


    }
