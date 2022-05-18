import { Component } from '@angular/core';
import { FormData} from './form-data';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Addmission Enrolment Form' ;
  courses=["Angular","React","Meteor"];
  userModel=new FormData("Billy","gate@gmail.com","9862836122","angular","morning",true);
}
