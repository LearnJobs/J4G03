function isPrime(num: number)
{
     for(let i=2; i<num; i++)
     {
         if(num % i  === 0) return false;
          return  num > 1;
     }
}
