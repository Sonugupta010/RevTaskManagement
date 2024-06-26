import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { PMHomeComponent } from './ProjectManager/pm-home/pm-home.component';
import { AHomeComponent } from './Admin/a-home/a-home.component';
import { THomeComponent } from './TeamMember/t-home/t-home.component';
import {LoginComponent} from './Admin/a-signup/login/login.component';
import {TSignupComponent} from './TeamMember/t-signup/t-signup.component';
import {PmLoginComponent} from './ProjectManager/PM-signup/login/login.component';
const routes: Routes = [
  {
    path: "",
    component: HomeComponent
  }, {
    path: "ProjectManager",
    component: PMHomeComponent
  },
  {
    path: "Admin",
    component: AHomeComponent,
  },
  {
    path: "TeamMember",
    component: THomeComponent
  },
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'AdminHome',
    component:AHomeComponent
  },
  {
    path:'Pmlogin',
    component:PmLoginComponent
  },
  {
    path:'Memlogin',
    component:TSignupComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
