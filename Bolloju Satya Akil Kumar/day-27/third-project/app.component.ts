import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  //templateUrl:'./app.component.html',
  //styleUrls: ['./app.component.css']
  template:`
  <div *ngFor="let item of color">
  
  <div [ngSwitch]="item">
    <div *ngSwitchCase="'red'" style="background-color: red;">
      {{item}}
    </div>
    <div *ngSwitchCase="'black'" style="background-color: black;">
      {{item}}
    </div>
    <div *ngSwitchCase="'yellow'" style="background-color: yellow;">
      {{item}}
    </div>
    <div *ngSwitchCase="'green'" style="background-color: green;">
      {{item}}
    </div>
    <div *ngSwitchCase="'pink'" style="background-color: pink;">
      {{item}}
    </div>
    <div *ngSwitchCase="'blue'" style="background-color: blue;">
      {{item}}
    </div>
  </div>
</div>
<br><br><br><br><br>
<div *ngIf="DataHideSystem;">
  Lorem ipsum dolor, sit amet consectetur adipisicing elit. Laboriosam blanditiis pari
  atur dolores harum, provident inventore debitis necessitatibus sunt nemo accusamus e
  a animi eos quibusdam ullam temporibus architecto molestias veniam assumenda nulla. 
  Quasi nesciunt porro nihil officia ipsum recusandae expedita possimus, voluptas dign
  issimos quibusdam minus incidunt sequi, tenetur rem eaque. Enim assumenda cum accusam
  us earum similique sunt cumque voluptatem. Aut, et! Labore deleniti architecto autem 
  doloribus quaerat ullam ea animi sit sapiente qui, eos dolorum eius dignissimos nisi?
   Consectetur laudantium ducimus delectus facere commodi similique in, explicabo omnis
    iure aliquid,
   reprehenderit culpa beatae earum esse voluptate harum fugit magni quas! Laudantium!
</div>
  `,
})
export class AppComponent{

     color=['red','black','pink','yellow','green','white','blue','cyan','brown','orange'];
     DataHideSystem:boolean=true;

}