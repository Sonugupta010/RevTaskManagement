import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProjectManagerComponent } from './project-manager/project-manager.component';
import { LoginComponent } from './login/login.component';
import { ResetPasswordComponent } from './reset-password/reset-password.component';
import { ClientInfoComponent } from './client-info/client-info.component';
// import { TeamMembersComponent } from './team-members/t/eam-members.component';
import { TaskAssignComponent } from './task-assign/task-assign.component';
import { DashboardComponent } from './dashboard/dashboard.component';


import { ProjectDetailsComponent } from './project-details/project-details.component';
import { ProjectsComponent } from './projects/projects.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'reset-password', component: ResetPasswordComponent },
  { path: 'project-manager', component: ProjectManagerComponent, children: [
      { path: '', redirectTo: 'dashboard', pathMatch: 'full' },
      { path: 'dashboard', component: DashboardComponent },
      { path: 'client-info', component: ClientInfoComponent },
      // { path: 'team-members', component: TeamMembersComponent },
      { path: 'task-assign', component: TaskAssignComponent },
      { path: 'projects', component: ProjectsComponent },
      { path: 'projects/:id', component: ProjectDetailsComponent },
      { path: 'projects/:id/task-assign', component: TaskAssignComponent }

    ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
