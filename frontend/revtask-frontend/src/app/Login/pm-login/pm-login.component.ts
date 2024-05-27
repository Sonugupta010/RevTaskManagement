import { Component, ViewChild, ElementRef } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pm-login',
  templateUrl: './pm-login.component.html',
  styleUrl: './pm-login.component.css'
})
export class PmLoginComponent {
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

constructor(private router:Router) { }

ngOnInit(): void {
  //   this.loginText = this.elementRef.nativeElement.querySelector('.title-text .login');
  // this.loginForm = this.elementRef.nativeElement.querySelector('form.login');
  // this.loginBtn = this.elementRef.nativeElement.querySelector('label.login');
  // this.signupBtn = this.elementRef.nativeElement.querySelector('label.signup');
  // this.signupLink = this.elementRef.nativeElement.querySelector('form .signup-link a');
  }

switchToSignupAd() {
    this.loginForm.nativeElement.style.marginLeft = "-50%";
    this.loginText.nativeElement.style.marginLeft = "-50%";
  }

switchToLoginAd() {
    this.loginForm.nativeElement.style.marginLeft = "0%";
    this.loginText.nativeElement.style.marginLeft = "0%";
  }


  redirect() {
    this.router.navigate(['/AdminHome']);
  }  
}

