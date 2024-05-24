import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { Card1Component } from './card1/card1.component';
import { Card2Component } from './card2/card2.component';
import { Card3Component } from './card3/card3.component';
import { RouterModule, Routes } from '@angular/router';
import { Card1NavComponent } from './card1-nav/card1-nav.component';
import { UserNavComponent } from './user-nav/user-nav.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';
import { ProjectDetailComponent } from './project-detail/project-detail.component';
import { UserHomeComponent } from './user-home/user-home.component';
import { EditTaskModalComponent } from './edit-task-modal/edit-task-modal.component';
import { ChangeStatusModalComponent } from './change-status-modal/change-status-modal.component';
import { CreateTaskModalComponent } from './create-task-modal/create-task-modal.component';
import { FormsModule } from '@angular/forms';


const routes: Routes = [
  {
  path: 'home',
  component: HomeComponent,
  
  children: [
  { path: 'card1', component: Card1Component,outlet:"card1" },
  { path: 'card2', component: Card2Component,outlet:"card2" },
  { path: 'card3', component: Card3Component,outlet:"card3" },
  
  // { path: '', redirectTo: 'card1', pathMatch: 'full' } // Default route
  ]
  },
  { path: 'card1-nav', component: Card1NavComponent },
  {
    path: 'user-nav',
    component: UserNavComponent,
    children: [
      {path: 'user-home', component:UserHomeComponent},
      { path: 'user-dashboard', component: UserDashboardComponent },
      { path: 'project-detail/:projectId', component: ProjectDetailComponent },
      // {path: 'create-task-modal', component:CreateTaskModalComponent},
      // {path:'edit-task-modal', component:EditTaskModalComponent},
      // {path:'change-task-modal', component:ChangeStatusModalComponent}
    ]
  },
  
  

  { path: '', redirectTo: 'home', pathMatch: 'full' }, // Redirect to home by default
  { path: '**', redirectTo: 'home' } // Redirect to home for any other invalid route
  ];


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    Card1Component,
    Card2Component,
    Card3Component,
    Card1NavComponent,
    UserNavComponent,
    UserDashboardComponent,
    ProjectDetailComponent,
    UserHomeComponent,
    EditTaskModalComponent,
    ChangeStatusModalComponent,
    CreateTaskModalComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
