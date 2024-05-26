package com.revtaskmanagement.RevTask.Service;

import com.revtaskmanagement.RevTask.Entity.Admin;
import com.revtaskmanagement.RevTask.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElseThrow();
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

//    public Admin updateAdmin(Long id, Admin adminDetails) {
//        Admin admin = adminRepository.findById(id).orElseThrow();
//        admin.setUsername(adminDetails.getUsername());
//        admin.setPassword(adminDetails.getPassword());
//        admin.setEmail(adminDetails.getEmail());
//        return adminRepository.save(admin);
//    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}

