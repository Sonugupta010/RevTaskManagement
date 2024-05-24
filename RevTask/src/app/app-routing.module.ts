import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CreateTaskModalComponent} from './create-task-modal/create-task-modal.component'

const routes: Routes = [
  {
    path:'create-task',
    component:CreateTaskModalComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
