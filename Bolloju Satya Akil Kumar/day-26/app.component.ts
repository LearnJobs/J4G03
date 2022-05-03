import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  template: `
    <h1>Hello</h1>
    <h2>Welcome Angular</h2>
    <h1>Add numbers</h1>
    <h2>{{add(30,10)}}</h2>
    <h1>Angular Pipes</h1>
    <h2>{{anystring}}</h2>
    <h3>{{anystring |  uppercase}}</h3> 
    <h3>{{anystring |  lowercase}}</h3> 
    <h4>{{anystring|slice:0:15 | uppercase}} {{anystring|slice:16:36 | lowercase}}</h4>
    <h4>{{anystring|slice:0:18| lowercase}} {{anystring|slice:19:36 | uppercase}}</h4>
    <h2>{{anystring|slice:0:18| lowercase}} {{anystring|slice:19:36 | uppercase}}</h2>
    <h1>PRIME NO</h1>
    <h3>{{primefun()}}</h3>

    `,
  styles: ['h1 {text-align:center;color:blue;}  h2 {text-align:center;color:red;} h3 {text-align:center;color:orange;}  h4 {text-align:center;color:sky-blue;}']
})
export class AppComponent {
  title = 'hello-world';
  sum=this.add(25,45);
  anystring:string="We Are Students of Angular Framework"


//addition
  add(a: any, b: any): any {
    return(a+b);
  }


  
  co:number=0;
  prime:string=' ';

 primefun() {
     for(let i=10;i<100;i++){
       this.co=0;
        for(let j=2;j<i;j++){
           if(i%j==0){
           this.co++;}
        }
        if(this.co<2){
          this.prime+=i+" ";
        }


  }
  return this.prime;
}

}