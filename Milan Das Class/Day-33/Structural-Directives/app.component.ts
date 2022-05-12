import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  //templateUrl: './app.component.html',
  //styleUrls: ['./app.component.css']
  template: `
      <h1>This project is {{title}}</h1>

      <!-- ngIf directive -->
      <div *ngIf="adult">
          <h1>ngIf is executed</h1>
      </div>

      <div *ngIf="false; else dontPrint">
          <h1>ngIf is executed</h1>
      </div>
      <ng-template #dontPrint>
          <h1>ngIf is not executed</h1>
      </ng-template>

      <div *ngIf="angular; then thenBlock; else elseBlock">
          <h1>ngIf condition is true</h1>
      </div>
      <ng-template #thenBlock>
          <h1>This text is in the thenBlock</h1>
      </ng-template>
      <ng-template #elseBlock>
          <h1>This text is in the elseBlock</h1>
      </ng-template>

      <div *ngIf="adult; then tBlock; else eBlock"></div>
      <ng-template #tBlock>
          <h1>The person is an adult</h1>
      </ng-template>
      <ng-template #eBlock>
          <h1>The person is a child</h1>
      </ng-template>

      <hr>
      <!-- ngSwitch directive -->
      <div [ngSwitch]="gender">
          <div *ngSwitchCase="'Male'"><h1>You are a Male</h1></div>
          <div *ngSwitchCase="'Female'"><h1>You are a Female</h1></div>
      </div>
      <div [ngSwitch]="color">
          <div *ngSwitchCase="'Red'"><h1>It is RED color</h1></div>
          <div *ngSwitchCase="'Green'"><h1>It is GREEN color</h1></div>
          <div *ngSwitchCase="'Blue'"><h1>It is BLUE color</h1></div>
          <div *ngSwitchDefault><h1>It is a DIFFERENT color</h1></div>
      </div>

      <hr>
      <!-- ngFor directive -->
      <div *ngFor="let color of colors; index as i; first as f; last as l; even as e; odd as o;">
          {{(i+1)+" First="+f+" Last="+l+" Odd="+e+" Event="+o+" Color="+color}}
      </div>
      <div *ngFor="let n of counter(1000); let i=index;">
          {{(i+1000)}}
      </div>
      `,
  styles: ['h1 {background-color:pink;text-align:center;color:red;}']
})
export class AppComponent {
  title = 'core-directives';
  angular:boolean = false;
  adult:boolean = false;
  gender:string = "Female";
  color:string = "Green";
  colors = ["Red","Green","Blue","Gray","Purple","Pink","Violet","Yellow","Lime","Black","White","Indigo","Orange"];

  public counter(i:number) {
    return new Array(i);
  }
}
