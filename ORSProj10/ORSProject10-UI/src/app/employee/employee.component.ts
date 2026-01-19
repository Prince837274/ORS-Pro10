import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
      super(locator.endpoints.EMPLOYEE, locator, route);// http://localhost:8080/EMPLOYEE
  
  }

  parseDate(dateString: string): Date {
    if (dateString) {
      return new Date(dateString);
      console.log(dateString)
    }
    return null;
  }

  
  }



