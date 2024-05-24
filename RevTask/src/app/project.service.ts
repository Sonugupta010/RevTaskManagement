import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { project } from './project';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  private apiUrl = 'http://localhost:3000/projects'; // Replace with your API endpoint

  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };

  getData(): Observable<project[]> {
    return this.http.get<project[]>(this.apiUrl);
  }
  // constructor(private http: HttpClient) { }

  // getProjectDetails(projectId: string): Observable<any> {
  //   return this.http.get(`https://your-api-url/projects/${projectId}`);
  // }
}
