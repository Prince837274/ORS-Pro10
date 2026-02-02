import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';

@Component({
  selector: 'app-compensation',
  templateUrl: './compensation.component.html',
  styleUrls: ['./compensation.component.css']
})
export class CompensationComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
      super(locator.endpoints.COMPENSATION, locator, route);// http://localhost:8080/compensation
  
  
    }

    populateForm(form, data) {

  form.id = data.id;
  form.staffMember = data.staffMember;
  form.paymentAmount = data.paymentAmount;
  form.state = data.state;
  form.dateApplied = data.dateApplied
}

  
    parseDate(dateString: string): Date {
      if (dateString) {
        return new Date(dateString);
        console.log(dateString)
      }
      return null;
    }
  
}
