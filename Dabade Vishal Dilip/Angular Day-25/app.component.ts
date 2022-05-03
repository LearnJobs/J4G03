import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  co:number=0;
  prime:string='|';

 primefun() {
     for(let i=10;i<100;i++){
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