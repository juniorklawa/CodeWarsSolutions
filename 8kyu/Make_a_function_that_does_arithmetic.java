class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {
  
    //int resultado;
   
   if (operator == "add"){
     return a+b;
   }
   else if(operator == "subtract") {
     return a-b;
   }
   else if (operator == "multiply"){
     return a*b;
   }
   else if (operator == "divide"){
     return a/b;
   }
   else {
     return 0; 
   }
  }
}
