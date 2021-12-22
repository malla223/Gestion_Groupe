import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const baseUrl = 'http://localhost:8080/api/administrateur';
@Injectable({
  providedIn: 'root'
})
export class AdminService {

  public login: any;
  public password: any;
  constructor(private http: HttpClient) { }

  saveAdmin(data: any): Observable<any> {
    return this.http.post(baseUrl + '/addAdministrateur', data);
  }
}
