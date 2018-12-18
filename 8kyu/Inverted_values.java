public class Kata {
  public static int[] invert(int[] array) {
  
  int[] auxArray = array;
  
  for(int i = 0;  i < array.length; i++){
   
      auxArray[i] *= -1;
    
  }
  return auxArray;
  }
}
