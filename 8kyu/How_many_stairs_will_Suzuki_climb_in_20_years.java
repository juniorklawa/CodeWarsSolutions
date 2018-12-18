public class Kata
{
    public static long stairsIn20(int[][] stairs)
    {
       int oneYear = 0;
       
       for(int i = 0; i < stairs.length; i++){
       
          for(int k = 0; k < stairs[i].length; k++){
            
            oneYear += stairs[i][k];
          }
         
       }
       
       return oneYear * 20;
    }
}
