import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
        super(locator.endpoints.PAYMENT, locator, route);// http://localhost:8080/payment
    
    
      }
  
      populateForm(form, data) {
  
    form.id = data.id;
    form.payerName = data.payerName;
    form.amount = data.amount;
    form.paymentMode = data.paymentMode;
    form.paymentStatus = data.paymentStatus
  }
  
    
      parseDate(dateString: string): Date {
        if (dateString) {
          return new Date(dateString);
          console.log(dateString)
        }
        return null;
      }
    
  }
  