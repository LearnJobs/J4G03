import { Component } from '@angular/core';
import { FormData } from './form-data';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public courses = ["Angular","React","Vue"];
  public userModel = new FormData("Bill Gates","billgates@microsoft.com","493384459","Angular","evening",true);

}
