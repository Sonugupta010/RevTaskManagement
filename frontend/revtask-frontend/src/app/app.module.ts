import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PmLoginComponent } from './Login/pm-login/pm-login.component';
import { TmLoginComponent } from './Login/tm-login/tm-login.component';
import { ALoginComponent } from './Login/a-login/a-login.component';
import { HomeComponent } from './home/home.component';
import { NavComponent } from './home/nav/nav.component';
import { FooterComponent } from './home/footer/footer.component';
import { PmNavComponent } from './project-manager/pm-nav/pm-nav.component';
import { ProjectsComponent } from './project-manager/projects/projects.component';
import { DashboardComponent } from './project-manager/dashboard/dashboard.component';
import { ProjectDetailsComponent } from './project-manager/project-details/project-details.component';
import { ClientInfoComponent } from './project-manager/client-info/client-info.component';
import { CreateTaskComponent } from './project-manager/create-task/create-task.component';
import { ResetPasswordComponent } from './project-manager/reset-password/reset-password.component';
import { TaskAssignComponent } from './project-manager/task-assign/task-assign.component';
import { PmHomeComponent } from './project-manager/pm-home/pm-home.component';

@NgModule({
  declarations: [
    AppComponent,
    PmLoginComponent,
    TmLoginComponent,
    ALoginComponent,
    HomeComponent,
    NavComponent,
    FooterComponent,
    PmNavComponent,
    ProjectsComponent,
    DashboardComponent,
    ProjectDetailsComponent,
    ClientInfoComponent,
    CreateTaskComponent,
    ResetPasswordComponent,
    TaskAssignComponent,
    PmHomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
