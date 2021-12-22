import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Admin } from '../Classe/admin';

const baseUrl = 'http://localhost:8080/api/administrateur';
@Injectable({
  providedIn: 'root'
})
export class AdminService {

 
  constructor(private http: HttpClient) { }

  getAdminById(login: any, password: any): Observable<Admin> {
    return this.http.get(`${baseUrl + '/detailApprenant'}/${login}/${password}`);
  }

  saveAdmin(data: any): Observable<any> {
    return this.http.post(baseUrl + '/addAdministrateur', data);
  }
}
