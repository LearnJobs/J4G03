import { Template } from '@angular/compiler/src/render3/r3_ast';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
Template:`
<div ng-app="" ng-controller="number1">
Number: <input type="text" ng-model="num1"><br>
<br>
<div ng-repeat="n in [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]">
    <p>{{num1}}*{{n}}={{num1 * n}}</p>
</div>
</div>
`;
export class AppComponent {
  
  title = 'multiplication';
  

}
