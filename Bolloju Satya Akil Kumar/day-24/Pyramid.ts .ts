// Pyramid of astericks
export {}
let space: number = 40;
let stars: number = 1;
let buffer: string;

for(let i=1; i<=9; i++) {
    buffer = "";
    for(let j=1; j<=space; j++) buffer = buffer + " ";
    for(let j=1; j<=stars; j++)  buffer = buffer + "*";
    space--; stars += 2;
    console.log(buffer);
}