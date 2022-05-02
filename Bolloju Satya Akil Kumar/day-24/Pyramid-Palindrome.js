"use strict";
exports.__esModule = true;
var space = 40;
var buffer;
for (var i = 1; i <= 9; i++) {
    buffer = "";
    for (var j = 1; j <= space; j++)
        buffer = buffer + " ";
    for (var j = 1; j <= i; j++)
        buffer = buffer + j;
    for (var j = (i - 1); j >= 1; j--)
        buffer = buffer + j;
    console.log(buffer);
    space--;
}
