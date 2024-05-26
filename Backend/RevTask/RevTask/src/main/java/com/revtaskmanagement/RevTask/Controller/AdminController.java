package com.revtaskmanagement.RevTask.Controller;

import com.revtaskmanagement.RevTask.Entity.Admin;
import com.revtaskmanagement.RevTask.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public ResponseEntity<List<Admin>> getAllAdmins() {

//        return adminService.getAllAdmins();
        List<Admin> admin = adminService.getAllAdmins();
        if(admin==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(admin,HttpStatus.OK);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
        Admin admin = adminService.getAdminById(id);
        if(admin==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(admin, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) {
        Admin createdAdmin = adminService.createAdmin(admin);
        return new ResponseEntity<>(createdAdmin, HttpStatus.CREATED);

    }

//    @PutMapping("/createAdmin/{id}")
//    public ResponseEntity<Admin> updateAdmin(@PathVariable Long id, @RequestBody Admin adminDetails) {
//        Admin updatedAdmin = adminService.updateAdmin(id,adminDetails);
//        if(updatedAdmin==null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
//    }

//    @DeleteMapping("/deleteAdmin/{id}")
//    public ResponseEntity<Object> deleteAdmin(@PathVariable Long id) {
//        boolean deleted = adminService.deleteAdmin(id);
//        if(!deleted){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//
//    }
}