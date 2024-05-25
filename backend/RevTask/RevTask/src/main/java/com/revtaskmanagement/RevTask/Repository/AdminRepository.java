package com.revtaskmanagement.RevTask.Repository;

import com.revtaskmanagement.RevTask.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
