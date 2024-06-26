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

        @Column(nullable = false, unique = true)
        private String username;

        @Column(nullable = false)
        private String password;

        @Column(nullable = false, unique = true)
        private String email;

        @Column(nullable = false)
        private String role;

        @ManyToMany(mappedBy = "teamMembers")
        private List<Project> projects;

        @OneToMany(mappedBy = "assignedTo")
        private List<Task> tasks;

}
