package com.revtaskmanagement.RevTask.Repository;

import com.revtaskmanagement.RevTask.Entity.ProjectManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectManagerRepository extends JpaRepository<ProjectManager,Long> {
}
