import { LiteralMapEntry } from '@angular/compiler/src/output/output_ast';
import { Component } from '@angular/core';
import  {DataView}  from './data-view';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 

  qalification=["10th",'11th','12th','Graduation','Post-Graduation','phd','mphil'];
  Apply=['Teacher','Engginear','Devloper','BPO','Marketing','Designer'];
  DataMode=new DataView(

      "vishal",
      "Dabade",
      "Dilip",
      'male',
      "17/11/2000",
      "Graduate",
      "vishaldabade1711@gmail.com",
      "7620627600",
      "Teacher",
      "lohagaon ta.tuljapur dist.osmanabad maharastra");
}
