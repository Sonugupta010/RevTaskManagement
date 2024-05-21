import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of, throwError } from 'rxjs';
import { AdminAuth } from './admin-auth';

@Injectable({
  providedIn: 'root'
})
export class AdminAuthService {
  private apiUrl = 'http://localhost:3000/AdminAuth';  // JSON server URL

  constructor(private http: HttpClient) {}
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };

  login(email: string, password: string): Observable<AdminAuth[]> {
    return this.http.get<AdminAuth[]>(`${this.apiUrl}?email=${email}&password=${password}`)
  }

  signup(adminData: AdminAuth): Observable<AdminAuth> {
    return this.http.post<AdminAuth>(this.apiUrl, adminData)
      
  }
}
