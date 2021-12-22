import { Component } from '@angular/core';
import { Apprenant } from '../Classe/apprenant';
import { ApprenantService } from '../services/apprenant.service';
import * as XLSX from 'xlsx';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {
  users: any[];
  list: Apprenant[];
  constructor(private aservice: ApprenantService) {}

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

  exportExcel() {
    import("xlsx").then(xlsx => {
        const worksheet = xlsx.utils.json_to_sheet(this.list); // Sale Data
        const workbook = { Sheets: { 'data': worksheet }, SheetNames: ['data'] };
        const excelBuffer: any = xlsx.write(workbook, { bookType: 'xlsx', type: 'array' });
        this.saveAsExcelFile(excelBuffer, "list");
        console.log(excelBuffer);
    });
  }
  saveAsExcelFile(buffer: any, fileName: string): void {
    import("file-saver").then(FileSaver => {
      let EXCEL_TYPE =
        "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=UTF-8";
      let EXCEL_EXTENSION = ".xlsx";
      const data: Blob = new Blob([buffer], {
        type: EXCEL_TYPE
      });
      FileSaver.saveAs(
        data,
        fileName + "_export_" + new Date().getTime() + EXCEL_EXTENSION
      );
    });
  }

  deleteA(id: any){
    this.aservice.deleteApprenant(id)
      .subscribe({
        next: (res) => {
          console.log('suprimer');
        },
        error: (e) => console.error(e)
      });
  }

}