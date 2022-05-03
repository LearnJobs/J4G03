var n1:number = 1;
var n2:number  = 100;
var i;
for(i=n1;i<n2;i++)
{
     if(isPrime(i))
     {
          console.log(i)
     }
}
function isPrime(num: number)
{
     for(let i=2; i<num; i++)
     {
         if(num % i  === 0) return false;
          return  num > 1;
     }
}
