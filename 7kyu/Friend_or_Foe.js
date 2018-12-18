function friend(friends){

var rf = [];
var c = 0;

for(var i = 0; i < friends.length; i++){

  if(friends[i].length == 4){
    
    rf[c] = friends[i];
    c++
  }
}
return rf;
}
