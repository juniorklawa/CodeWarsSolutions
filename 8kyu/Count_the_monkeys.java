public class MonkeyCounter
{
  public static int[] monkeyCount(final int n){
  
  int[] newA = new int [n];
  int x = 1;
  for(int i = 0; i < n; i ++ ){
    newA[i] = x;
    x++;
  }
  return newA;
  }
} 
