import { Component } from '@angular/core';

@Component({
  selector: 'app-uform',
  templateUrl: './uform.component.html',
  styleUrl: './uform.component.css'
})
export class UFormComponent {
  userData = {
    username: '',
    email: '',
    password: ''
  };

  handleSubmit(){
    
    alert('Form Submited for User');
  }
}
