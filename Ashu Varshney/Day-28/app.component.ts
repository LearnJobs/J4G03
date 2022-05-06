import { Component } from '@angular/core';
import { FormData } from './form-data';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public cources = ["Juniar Engineer", "Senior Engineer", "Manager"];
  public userModel = new FormData(
    "Ashu",
    "Varsheny",
    "Satish",
    "male",
    "02/07/2001",
    "graduate",
    "aashuvarshney252@gmail.com",
    "7983762436",
    "manager",
    "chandausi");

}
