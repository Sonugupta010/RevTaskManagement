import { Component, ViewChild,ElementRef } from '@angular/core';

@Component({
  selector: 'app-card2',
  templateUrl: './card2.component.html',
  styleUrl: './card2.component.css'
})
export class Card2Component {
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

constructor() { }

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

handleSignupLinkAd(event: Event) {
    this.signupBtn.nativeElement.click();
    event.preventDefault();
  }
}
