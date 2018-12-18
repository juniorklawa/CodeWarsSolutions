function alphabetWar(fight)
{
  
  let rs = 0;
  let ls = 0;
  
  for(var i = 0; i < fight.length; i++){
  
  switch(fight.charAt(i)){
    case 'w':
    ls += 4;
    break;
    case 'p':
    ls += 3;
    break;
    case 'b':
    ls += 2;
    break;
    case 's':
    ls += 1;
    break;
    case 'm':
    rs += 4;
    break;
    case 'q':
    rs += 3;
    break;
    case 'd':
    rs += 2;
    break;
    case 'z':
    rs += 1;
    break;
  }
}

if (rs > ls){
  return "Right side wins!"
}
else if (ls > rs){
  return "Left side wins!"
}
else {
  return "Let's fight again!";
}
   
}
