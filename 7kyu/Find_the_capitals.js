var capitals = function (word) {

var arr = [];

  for (var i = 0; i < word.length; i++){
  
    if (word[i] === word[i].toUpperCase()){
    
      arr.push(i);
    }
      
  }
  
  return arr;
};
