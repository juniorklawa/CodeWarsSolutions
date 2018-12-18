function factorial(n){
var f = 1;


if (n < 0 || n > 12){
  throw new RangeError("Errou");
}

for(var i = 1; i <= n; i++){

  f *= i;
}

return f;

}
