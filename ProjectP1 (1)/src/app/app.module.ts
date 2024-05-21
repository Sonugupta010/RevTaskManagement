import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './layout/header/header.component';
import { FooterComponent } from './layout/footer/footer.component';
import { LoginComponent } from './layout/login/login.component';
import { SignupComponent } from './layout/signup/signup.component';
import { PMNavbarComponent } from './ProjectManager/pm-navbar/pm-navbar.component';
import { PMHomeComponent } from './ProjectManager/pm-home/pm-home.component';
import { PMDashboardComponent } from './ProjectManager/pm-dashboard/pm-dashboard.component';
import { ANavbarComponent } from './Admin/a-navbar/a-navbar.component';
import { AHomeComponent } from './Admin/a-home/a-home.component';
import { ADashboardComponent } from './Admin/a-dashboard/a-dashboard.component';
import { THomeComponent } from './TeamMember/t-home/t-home.component';
import { TDashboardComponent } from './TeamMember/t-dashboard/t-dashboard.component';
import { TNavbarComponent } from './TeamMember/t-navbar/t-navbar.component';
import { TSignupComponent } from './TeamMember/t-signup/t-signup.component';
import { NavbarComponent } from './layout/navbar/navbar.component';
import {PmLoginComponent} from './ProjectManager/PM-signup/login/login.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PmFormComponent } from './Admin/Forms/pm-form/pm-form.component';
import { UFormComponent } from './Admin/Forms/uform/uform.component';

import { FormsModule } from '@angular/forms'; 

import { Login1Component } from './Admin/a-signup/login1/login1.component'; 


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    SignupComponent,
    PMNavbarComponent,
    PMHomeComponent,
    PMDashboardComponent,
    ANavbarComponent,
    AHomeComponent,
    ADashboardComponent,
    THomeComponent,
    TDashboardComponent,
    TNavbarComponent,
    TSignupComponent,
    NavbarComponent,
    PmLoginComponent,
    PmFormComponent,
    UFormComponent,
    Login1Component
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
