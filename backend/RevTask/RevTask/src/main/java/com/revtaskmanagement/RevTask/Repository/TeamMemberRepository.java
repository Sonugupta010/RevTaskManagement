package com.revtaskmanagement.RevTask.Repository;

import com.revtaskmanagement.RevTask.Entity.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamMemberRepository extends JpaRepository<TeamMember, Long> {
}
