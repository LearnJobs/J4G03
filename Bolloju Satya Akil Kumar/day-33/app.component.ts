import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  //templateUrl: './app.component.html',
  //styleUrls: ['./app.component.css']
  template:`
 
    <h1>Angular Pipes</h1>
    
  <h1>PRIME NO</h1>
<h4>{{primefun()}}</h4>




<h3 *ngFor="let i of num" style="display: inline-block;">
            <span>{{data[i]|uppercase}}&nbsp;</span> <span>{{data[i+1]|lowercase}}&nbsp;</span>
</h3>
  `,
    styles: ['h1 {text-align:center;color:blue;}  h2 {text-align:center;color:red;} h3 {text-align:center;color:orange;}  h4 {text-align:center;color:sky-blue;}']
})
export class AppComponent {
  title = 'Prime-Numbers';
  sum=this.add(25,45);
  anystring:string="We Are Students of Angular Framework"  
  co:number=0;
  prime:string='|';
   num=[0,2,4];
   data = [ ];
   //addition
  add(a: any, b: any): any {
    return(a+b);
  }

 primefun() {
     for(let i=2500;i<3000;i++){
       this.co=0;
        for(let j=2;j<i;j++){
           if(i%j==0){
           this.co++;}
        }
        if(this.co<2){
          this.prime+=i+"|";
        }


  }
  return this.prime;
}
line:string="We Are Student Of Angular FreameWork";

}