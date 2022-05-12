import { Component, NgModule } from '@angular/core';

@Component({
  selector: 'app-root',
  //templateUrl: './app.component.html',
  //styleUrls: ['./app.component.css']
template:`
<h2>Welcome to fourth Session</h2>

<!-- Two way binding with ngModel directive -->

<br><br>
<!-- Directive like nglf in the Core module -->
<div *ngIf="isDisplayed; else elseBlock">
    <h2>The Coders Nation</h2>
</div>
<ng-template #elseBlock>
  <h2>LearnJobs</h2>
</ng-template>
<ng-template #thenBlock>
<h2>The Coders Nation</h2>
</ng-template>
<div *ngIf="isDisplayed; then thenBlock; else elseBlock"></div>
<br><br>


`,
styles:['h2 {background-color:lightgrey;}']
})
export class AppComponent {
  title = 'fourth-project';
public isDisplayed: boolean = true;


}

