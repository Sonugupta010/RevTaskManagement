import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-a-home',
  templateUrl: './a-home.component.html',
  styleUrl: './a-home.component.css'
 
})
export class AHomeComponent {
  constructor(private router: Router) {}


  logout(){
    this.router.navigate(['']);
  }

  handleHome(){
    this.router.navigate(['/AdminHome'])
  }


  

 
  
  
  
}
