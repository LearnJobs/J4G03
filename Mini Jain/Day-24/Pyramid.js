"use strict";
exports.__esModule = true;
var spaces = 40;
var stars = 1;
var buffer;
for (var i = 1; i <= 9; i++) {
    buffer = "";
    for (var j = 1; j <= spaces; j++)
        buffer = buffer + " ";
    for (var j = 1; j <= stars; j++)
        buffer = buffer + "*";
    spaces--;
    stars += 2;
    console.log(buffer);
}