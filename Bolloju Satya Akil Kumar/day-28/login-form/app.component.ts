import { Component } from '@angular/core';
import { FormData } from './form-data';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
public userModel = new FormData("akhil","akhil@18","akhil@18");
}
