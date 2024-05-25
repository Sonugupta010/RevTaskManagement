package com.revtaskmanagement.RevTask.Repository;

import com.revtaskmanagement.RevTask.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
