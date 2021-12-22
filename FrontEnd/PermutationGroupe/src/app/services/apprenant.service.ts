import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Apprenant } from '../Classe/apprenant';


const EXCEL_TYPE = 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=UTF-8';
const EXCEL_EXTENSION = '.xlsx';

const baseUrl = 'http://localhost:8080/api/apprenant';

@Injectable({
  providedIn: 'root'
})
export class ApprenantService {

  constructor(private http: HttpClient) { }

  getAllApprenant(): Observable<Apprenant[]> {
    return this.http.get<Apprenant[]>(baseUrl + '/listApprenant');
  }

  getApprenantById(id: any): Observable<Apprenant> {
    return this.http.get(`${baseUrl + '/detailApprenant'}/${id}`);
  }

  saveApprenant(data: any): Observable<any> {
    return this.http.post(baseUrl + '/addApprenant', data);
  }

  updateApprenant(id: any, data: any): Observable<any> {
    return this.http.put(`${baseUrl + '/updateApprenant'}/${id}`, data);
  }

  deleteApprenant(id: any): Observable<any> {
    return this.http.delete(`${baseUrl + '/deleteApprenant'}/${id}`);
  }


  //  exportToExcel(data, filename) {
  //   {
  //   const ws: XLSX.WorkSheet = XLSX.utils.table_to_sheet(data);
  //   const wb: XLSX.WorkBook = XLSX.utils.book_new();
  //   XLSX.utils.book_append_sheet(wb, ws, filename);
  //   XLSX.writeFile(wb, filename);
  //   }
  //   }


   
}
