var n1 = 1;
var n2 = 100;
var i;
for (i = n1; i <= n2; i++) {
    if (isPrime(i)) {
        console.log(i);
    }
}
function isPrime(num) {
    for (var i = 2; i < num; i++)
        if (num % i === 0)
            return false;
    return num > 1;
}