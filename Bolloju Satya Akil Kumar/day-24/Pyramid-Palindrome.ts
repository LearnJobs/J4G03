// Pyramid of Pallindrome numbers are
export {}
let space: number = 40;
let buffer: string;

for(let i=1; i<=9; i++) {
    buffer = "";
    for(let j=1; j<=space; j++) buffer = buffer + " ";
    for(let j=1; j<=i; j++)     buffer = buffer + j;
    for(let j=(i-1); j>=1; j--) buffer = buffer + j;
    console.log(buffer);
    space--;
}