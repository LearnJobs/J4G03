import { Component } from '@angular/core';
import { FormData } from './form-data';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'college form';
  public qualification = ["B.tech","pG","M.tech"];
  public Stream = ["cse","ece","civil","eee","mech","it","pe"];
  public userModel = new FormData("akhil","srinivas","male","04-12-1997","cse","B.tech","12");
}
