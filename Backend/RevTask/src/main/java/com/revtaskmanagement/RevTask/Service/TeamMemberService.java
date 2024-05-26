package com.revtaskmanagement.RevTask.Service;

import com.revtaskmanagement.RevTask.Entity.TeamMember;
import com.revtaskmanagement.RevTask.Repository.TeamMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamMemberService {

    @Autowired
    private TeamMemberRepository teamMemberRepository;

    public List<TeamMember> getAllTeamMembers() {
        return teamMemberRepository.findAll();
    }

    public TeamMember getTeamMemberById(Long id) {

        return teamMemberRepository.findById(id).orElseThrow();
    }

    public TeamMember createTeamMember(TeamMember teamMember) {

        return teamMemberRepository.save(teamMember);
    }

    public TeamMember updateTeamMember(Long id, TeamMember teamMemberDetails) {
        TeamMember teamMember = teamMemberRepository.findById(id).orElseThrow();
        teamMember.setUsername(teamMemberDetails.getUsername());
        teamMember.setPassword(teamMemberDetails.getPassword());
        teamMember.setEmail(teamMemberDetails.getEmail());
        teamMember.setRole(teamMemberDetails.getRole());
        return teamMemberRepository.save(teamMember);
    }

    public void deleteTeamMember(Long id) {

        teamMemberRepository.deleteById(id);
    }
}
