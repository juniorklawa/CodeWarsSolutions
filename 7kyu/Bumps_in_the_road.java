public class BumpsTheRoad {
  public static String bumps(final String road) {
  
  char[] array = road.toCharArray();
  int contador = 0;
  
  for (int i = 0; i < road.length(); i++) {
      
      if (array[i] == 'n'){
          contador++;        
      }     
  }
  
  if (contador > 15){
    return "Car Dead";
  }
  else {
    return "Woohoo!";
  }
  
  }
}
