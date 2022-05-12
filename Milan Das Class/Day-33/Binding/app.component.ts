import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
      <!-- Interpolation -->
      <h1>This is my first project</h1>
      <h2>{{batches}}</h2>
      <h2>{{name.toUpperCase()}}</h2>
      <h2>{{name.length}}</h2>
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

      <hr>
      <!-- Style binding -->
      <h2 [style.color]="'blue'">This is Style Binding</h2>
      <h2 [style.color]="false ? 'green' : 'red'">This is Style Binding</h2>
      <h2 [style.color]="isError ? 'green' : 'red'">This is Style Binding</h2>
      <p [style.color]="isError ? 'green' : 'red'">Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. Quick Brown Fox Jumps Over The Dog. </p>

      <hr>
      <!-- Event binding -->
      <button (click)="welcome($event)">Welcome</button><br>
      <button (click)="event_message='Hello world'">Welcome</button>
      {{event_message}}

      <hr>
      <!-- Template Reference Variables -->
      <input #myInput type="text"><br>
      <button (click)="showMessage(myInput.value)">Console</button>
      <input #myVar value="Some Value" />
      <button (click)="message(myVar.value)">Click</button>

      <hr>
      <!-- Two way binding -->
      <input [(ngModel)]="name" type="text"><br>
      {{name}}
      <hr>

      `,
  styles: ['h1 {background-color:pink; color:red; text-align: right;}',
           '.success {color:green;}', 
           '.error {color:red;}',
           '.special {font-style:italic;}']
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
    event_message = "";

    ngOnInit() {
    }

    public greet():string {
        return "Welcome " + this.name;
    }

    showMessage(message) {
        console.log("Some message on the console");
        console.log(message);
    }

    message(mes) {
        console.log("The Click button is pressed");
        console.log(mes);
    }

    welcome(event) {
        console.log("Welcome students of Angular");
        console.log(event);
    }
}
