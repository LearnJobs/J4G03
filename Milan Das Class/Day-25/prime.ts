let start: number = 5000;
let end: number = 5500;
let yesPrime: boolean;
let buffer: string = "";

for(let i=start; i<=end; i++) {
    yesPrime = true;
    for(let j=2; j<i; j++) {
        if(i%j==0) {
            yesPrime = false;
            break;
        }
    }
    if(yesPrime) {
        buffer = buffer + "  " + i;
    }
}
console.log(buffer);
