import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-compensationlist',
  templateUrl: './compensationlist.component.html',
  styleUrls: ['./compensationlist.component.css']
})
export class CompensationlistComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
        super(locator.endpoints.COMPENSATION, locator, route); // http://localhost:8080/compensation
    } 
    

}
