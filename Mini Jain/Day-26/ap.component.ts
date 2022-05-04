import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  //templateUrl: './app.component.html',
  //styleUrls: ['./app.component.css']
  template: `
      <h1>Hello Students</h1>
      <h1>You are the students of Angular</h1>
      <h1>This is {{title}}</h1>
      <h2>{{company}}</h2>
      <h2>{{add(30,10)}}</h2>
      <h2>{{add("Hello ","World")}}</h2>
      {{primeno(1000,2500)}}<br><br>
      <h1>Angular PIPES</h1>
      <h2>{{anystring}}</h2>
      <h2>{{anystring | uppercase}}</h2>
      <h2>{{anystring | lowercase}}</h2>
      <h2>{{anystring | titlecase}}</h2>
      <h2>{{anystring | uppercase | slice:6:16}}</h2>
      <h2>{{anystring | uppercase | slice:16}}</h2>
      <h2>{{today}}</h2>
      <h2>{{today | date:'short'}}</h2>
      <h2>{{today | date:'shortDate'}}</h2>
      <h2>{{today | date:'shortTime'}}</h2>
      <h2>{{average | percent}}</h2>
      <h2>{{amount | currency}}</h2>
      <h2>{{amount | currency:'INR'}}</h2>
      <h2>{{some_number | number:'3.3-3'}}</h2>
      <h2>{{some_number | number:'1.5-7'}}</h2>
      <h2>{{name}}</h2>
      <br><br>
      <br><br>
      `,
  styles: ['h1 {text-align:center;color:blue;}','h2 {background-color:lightPink;text-align:center;color:blue;}']
})
export class AppComponent {
  title = 'first-project';
  company:string = "Google Inc.";
  sum = this.add(25,45);
  anystring: string = "QuiCk BrOwEn FoX JuMps OvEr ThE LaZy DoG";
  today = new Date();
  average: number = 0.25;
  amount: number = 33000.25;
  some_number: number = 3.4567;
  name:string = "Mahatma Gandhi";

  ngOnInit() {
  }

  alternate():string {
    //this.anystring.split(separator: " ")
    return "";
  }

  add(a: any, b: any): any {
    return(a+b);
  }

  primeno(n1:number, n2:number): string {
    let buffer: string = "";
    let yn: boolean;

    for(let i = n1; i <= n2; i++) {
      yn = true;
      for(let j = 2; j < i; j++) {
        if(i%j==0) {
          yn = false;
          break;
        }
      }
      if(yn) buffer = buffer+" "+i+" ";
    }
    return buffer;
  }
}
function separator(separator: any) {
  throw new Error('Function not implemented.');
}