export {}
let start: number = 10;
let end: number = 15;
let buffer: string;

let i: number;
let j: number;
for(j=1; j<=10; j++) {
    buffer = "";
    for(i=start; i<=end; i++) {
        buffer = buffer + padL(i,2) + " x " + padL(j,2) + " = " + padL((i*j),3) + "  ";
    }
    console.log(buffer);
}

function padL(n:number, l:number): string {
    let buf:string = n.toString();
    for(let i=buf.length; i<l; i++)
        buf = " "+buf;
    return buf;
}