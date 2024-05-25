package com.revtaskmanagement.RevTask.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class TeamMember {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String username;
        private String password;

        @ManyToMany(mappedBy = "teamMembers")
        private List<Project> projects;

        @OneToMany(mappedBy = "assignedTo")
        private List<Task> tasks;

}
