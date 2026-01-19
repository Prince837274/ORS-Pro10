import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent extends BaseListCtl{
 
  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
        super(locator.endpoints.EMPLOYEE, locator, route); // http://localhost:8080/employee
    } 
  
  

}
