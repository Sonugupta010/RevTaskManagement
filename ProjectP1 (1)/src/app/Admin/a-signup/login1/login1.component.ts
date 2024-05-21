import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { AdminAuthService } from '../../../admin-auth.service';
import { AdminAuth } from '../../../admin-auth';

@Component({
  selector: 'app-login',
  templateUrl: './login1.component.html',
  styleUrls: ['./login1.component.css']
})
export class Login1Component implements OnInit {
passwordInput: any;
  constructor(private adminAuthService: AdminAuthService, private router: Router) {}

  @ViewChild('loginText')
  loginText!: ElementRef;
  @ViewChild('loginForm')
  loginForm!: ElementRef;
  @ViewChild('loginBtn')
  loginBtn!: ElementRef;
  @ViewChild('signupBtn')
  signupBtn!: ElementRef;
  @ViewChild('signupLink')
  signupLink!: ElementRef;

  ngOnInit(): void {
    // Initialization logic
  }

  switchToSignupAd() {
    this.loginForm.nativeElement.style.marginLeft = '-50%';
    this.loginText.nativeElement.style.marginLeft = '-50%';
  }

  switchToLoginAd() {
    this.loginForm.nativeElement.style.marginLeft = '0%';
    this.loginText.nativeElement.style.marginLeft = '0%';
  }

  login(email: string, password: string): void {
    this.adminAuthService.login(email, password).subscribe(
      (admins) => {
        if (admins.length > 0) {
          console.log('Login successful', admins[0]);
        } else {
          console.warn('No matching user found');
        }
      },
      (error) => {
        console.error('An error occurred while logging in', error);
      },
      () => {
        console.log('Login subscription completed');
      }
    );
  }
  

  signup(username: string, email: string, password: string): void {
    console.log(username);
    const adminData: AdminAuth = { username, email, password };
    this.adminAuthService.signup(adminData).subscribe(
      (newAdmin) => {
        console.log('Signup successful', newAdmin);
      },
      (error) => {
        console.log('Signup failed', error);
      }
    );
  }
  
}
