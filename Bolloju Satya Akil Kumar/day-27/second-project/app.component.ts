import { Component, NgModule } from '@angular/core';

@Component({
  selector: 'app-root',
  //templateUrl: './app.component.html',
  //styleUrls: ['./app.component.css']
template:`
<h2>Welcome to Second Session</h2>

<!-- Two way building with ngModel directive -->
Father of the nation:
<input [(ngModel)] = "father" type = "text"><br>
{{father}}
<br><br>
<!-- Directive like nglf in the Core module -->
<div *ngIf="isDisplayed; else elseBlock">
    <h2>This is the content of ngIf in the condition</h2>
</div>
<ng-template #elseBlock>
  <h2>The content is hidden</h2>
</ng-template>
<ng-template #thenBlock>
<h2>This is the from the thenBlock</h2>
</ng-template>
<div *ngIf="isDisplayed; then thenBlock; else elseBlock"></div>
<br><br>
<!-- Directive like ngSwtch in the core module -->
<div [ngSwitch]="language">
<div *ngSwitchCase="'C'"><h2>It is C Language</h2></div>
<div *ngSwitchCase="'C++'"><h2>It is C++ Language</h2></div>
<div *ngSwitchCase="'Java'"><h2>It is Java Language</h2></div>
<div *ngSwitchCase="'Python'"><h2>It is Python Language</h2></div>
<div *ngSwitchCase="'Typescript'"><h2>It is Typescript Language</h2></div>
</div>
<br><hr><br>
<!-- Directive like ngFor in the Core module -->
<br><hr><br>
<div *ngFor="let color of colors; index as i; first as f; last as l; even as e; odd as o">
  <h2>Index={{i}} First={{f}} Last={{l}} Even={{e}} Odd={{o}} Color={{color}}</h2>
</div>  
<br><hr><br>
<!-- Program to print alternate word in a sentence in uppercase and lowercase character -->
<div *ngFor="let word of wordArr; even as e">
     <div>{{concat(word, e)}}</div>
 </div>
 <h2>{{buffer}}</h2>
<br><hr><br>
`,
styles:['h2 {background-color:lightgrey;}']
})
export class AppComponent {
  title = 'second-project';
public father:string = "Mahatma Gandhi"
public isDisplayed: boolean = true;
public language:string = "C++";
public colors = ["Red","Green","Blue","cyan","Gray","Indigo","Orange","Magenta","Pink","Violet","Yellow"]
public sentence = "quick brown fox jumps over the lazy dog"
public wordArr = this.sentence.split(" ");
public buffer: string = "";

ngOnInit() {

}
concat(x:string, z:boolean) {
  if(z) {this.buffer = this.buffer + x.toLowerCase() + " ";}
  else  {this.buffer = this.buffer + x.toUpperCase() + " ";}
  return;
}
}

