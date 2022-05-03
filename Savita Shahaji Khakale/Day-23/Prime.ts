let start : number =2000;
let end: Number =2500;
let yesPrime: boolean;
let buffer: string ="";
for(let i=start;i<=end;i++)
    {
     yesPrime = true;
        for(let j=2;j<i;j++)
        {
         if(i%j==0)
          {
               yesPrime = false;
               break;
          }
     }
     if(yesPrime)
     {
         buffer = buffer + " "+i;
     }
    }
    console.log(buffer);