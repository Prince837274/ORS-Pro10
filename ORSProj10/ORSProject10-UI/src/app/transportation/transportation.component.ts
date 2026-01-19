import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-transportation',
  templateUrl: './transportation.component.html',
  styleUrls: ['./transportation.component.css']
})
export class TransportationComponent extends BaseCtl {

   

constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.TRANSPORTATION, locator, route);// http://localhost:8080/transportation


  }

  parseDate(dateString: string): Date {
    if (dateString) {
      return new Date(dateString);
      console.log(dateString)
    }
    return null;
  }
  
}
