import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
      <!-- Interpolation -->
      <h1>This is my first project</h1>
      <h2>{{batches}}</h2>
      <h2>{{name.toUpperCase()}}</h2>
      <h2>{{25 + 35}}</h2>
      <h2>{{"Hello " + "World!"}}</h2>
      <h2>{{greet()}}</h2>

      <hr>
      <!-- Property binding -->
      <input type="text" value="LearnJobs" [id]="myid" /><br>
      <input type="text" value="Herculus" id="{{myid2}}" /><br>

      <hr>
      <!-- Class binding -->
      <h2 class="success">Are you correct?</h2>
      <h2 [class]="errorClass">Are you correct?</h2>
      <h2 [class]="successClass">Are you correct?-3</h2>
      <h2 [class]="specialClass">Are you correct?</h2>
      <h2 [class.error]="isError">Are you correct?-5</h2>

      `,
  styles: ['h1 {background-color:pink; color:red; text-align: right;}','.success {color:green;}', '.error {color:red;}','.special {font-style:italic;}']
  //templateUrl: './app.component.html',
  //styleUrls: ['./app.component.css']
 
})
export class AppComponent implements OnInit {
    public batches:string = "FSD-02 + GAVS-02 + GAVS-03";
    public name:string = "The Coders Nation";
    myid = "book";
    myid2 = "notebook";
    classname = "alignment";
    isError = true;
    errorClass = "error";
    successClass = "success";
    specialClass = "special";

    ngOnInit() {
    }

    public greet():string {
        return "Welcome " + this.name;
    }
}
