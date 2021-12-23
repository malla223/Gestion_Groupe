import { Component } from '@angular/core';
import { Apprenant } from '../Classe/apprenant';
import { ApprenantService } from '../services/apprenant.service';
import { Router } from '@angular/router';
import * as FileSaver from 'file-saver';
import * as XLSX from 'xlsx';

const EXCEL_TYPE = 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=UTF-8';
const EXCEL_EXTENSION = '.xlsx';


@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {
  users: any[];
  list: Apprenant[];
  filterTerm: string;

  constructor(private aservice: ApprenantService, private route: Router) {}

  ngOnInit(): void {
    this.getList();
  }

  getList(): any {
    this.aservice.getAllApprenant()
      .subscribe({
        next: (data) => {
          this.list = data;
          console.log(data);
        },
        error: (e) => console.error(e)
      });
  }

  deleteA(id: any){
    this.aservice.deleteApprenant(id)
      .subscribe(res =>{
          console.log('res');
          this.getList();
      })
  }

  apprenantDetails(id_Apprenant: any){
    this.route.navigateByUrl('/detail', id_Apprenant);
  }

  public exportAsExcelFile(json: any[], excelFileName: string): void {
    const worksheet: XLSX.WorkSheet = XLSX.utils.json_to_sheet(json);
    const workbook: XLSX.WorkBook = {
       Sheets: {
          'list': worksheet
       },
       SheetNames: ['list']
    };
    const excelBuffer: any = XLSX.write(workbook, {
       bookType: 'xlsx',
       type: 'array'
    });
    this.saveAsExcelFile(excelBuffer, excelFileName);
 }
 private saveAsExcelFile(buffer: any, fileName: string): void {
    const data: Blob = new Blob([buffer], {
       type: EXCEL_TYPE
    });
    FileSaver.saveAs(data, fileName + EXCEL_EXTENSION);
 }

 exportExcel(): void{
    this.exportAsExcelFile(this.list, 'list');
 }
}