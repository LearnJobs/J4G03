"use strict";
exports.__esModule = true;
var start = 10;
var end = 15;
var buffer;
var i;
var j;
for (j = 1; j <= 10; j++) {
    buffer = "";
    for (i = start; i <= end; i++) {
        buffer = buffer + padL(i, 2) + " x " + padL(j, 2) + " = " + padL((i * j), 3) + "  ";
    }
    console.log(buffer);
}
function padL(n, l) {
    var buf = n.toString();
    for (var i_1 = buf.length; i_1 < l; i_1++)
        buf = " " + buf;
    return buf;
}