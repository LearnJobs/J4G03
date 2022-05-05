import { Component } from '@angular/core';
import { FormData } from './form-data';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public Qualification= ["B.tech","pG","M.tech"];
  public Apply= ["Goverment","public","private","It"];
  public userModel = new FormData("akhil","bolloju","srinivas","male","04-12-1997","B.tech","akhilkumarbolloju35@gmail.com","7013868886","It","suryanagar,highschool,amalapuram");
}
