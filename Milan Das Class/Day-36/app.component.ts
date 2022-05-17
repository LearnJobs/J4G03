import { Component } from '@angular/core';
import { FormData } from './form-data';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Admission Enrollment Form';
  courses = ["Angular","React","Vue.js","Ember.js","Meteor","Mithril","Polymer"];
  userModel = new FormData("Bill Gates","gates@microsoft.com","001-33004450","Angular","morning",true);
}
