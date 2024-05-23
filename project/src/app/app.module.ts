import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProjectManagerComponent } from './project-manager/project-manager.component';
import { LoginComponent } from './login/login.component';
import { ResetPasswordComponent } from './reset-password/reset-password.component';
import { ClientInfoComponent } from './client-info/client-info.component';
// import { TeamMembersComponent } from './team-members/team-members.component';
import { TaskAssignComponent } from './task-assign/task-assign.component';
import { NavbarComponent } from './navbar/navbar.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ProjectsComponent } from './projects/projects.component';
import { CreateTaskModalComponentComponent } from './create-task-modal-component/create-task-modal-component.component';
import { HttpClientModule } from '@angular/common/http';
import { ProjectService } from './project.service.service';
import { TaskService } from './task.service';

@NgModule({
  declarations: [
    AppComponent,
    ProjectManagerComponent,
    LoginComponent,
    ResetPasswordComponent,
    ClientInfoComponent,
    // TeamMembersCompon/ent,
    TaskAssignComponent,
    NavbarComponent,
    DashboardComponent,
    ProjectsComponent,
    CreateTaskModalComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ProjectService, TaskService],
  bootstrap: [AppComponent]
})
export class AppModule { }
