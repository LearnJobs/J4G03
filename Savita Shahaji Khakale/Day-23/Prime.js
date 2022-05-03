var start = 5000;
var end = 5500;
var yesPrime;
var buffer = "";
for (var i = start; i <= end; i++) {
    yesPrime = true;
    for (var j = 2; j < i; j++) {
        if (i % j == 0) {
            yesPrime = false;
            break;
        }
    }
    if (yesPrime) {
        buffer = buffer + "  " + i;
    }
}
console.log(buffer);