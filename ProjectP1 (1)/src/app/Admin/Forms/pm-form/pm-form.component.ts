import { Component } from '@angular/core';

@Component({
  selector: 'app-pm-form',
  templateUrl: './pm-form.component.html',
  styleUrl: './pm-form.component.css'
})
export class PmFormComponent {
  userData = {
    username: '',
    email: '',
    password: ''
  };
}
