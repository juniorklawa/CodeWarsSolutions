function catMouse(x){

let c = 0;

 for(var i = 0; i < x.length; i++){
   if(x[i] === '.'){
     c++;
   }
 }
 
 if(c <= 3){
   return "Caught!";
 }
 else{
   return "Escaped!";
 }
 

}
