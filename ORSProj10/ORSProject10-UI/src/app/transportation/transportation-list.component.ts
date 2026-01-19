import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-transportation-list',
  templateUrl: './transportation-list.component.html',
  styleUrls: ['./transportation-list.component.css']
})
export class TransportationListComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
      super(locator.endpoints.TRANSPORTATION, locator, route); // http://localhost:8080/transportation
  } 
  

}
