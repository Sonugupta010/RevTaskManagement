package com.revtaskmanagement.RevTask.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String title;
        private String description;
        private String status;

        @ManyToOne
        @JoinColumn(name = "project_id")
        private Project project;

        @ManyToOne
        @JoinColumn(name = "assigned_to")
        private TeamMember assignedTo;

}
