class Kata {
  public static String getMiddle(String word) {
    String str = word;
   
         int primeira;
        
         if((str.length() - 1 )% 2 != 0){
             
             primeira = str.length() /2;
             str = str.substring(primeira - 1,primeira + 1);
             System.out.println(str);
             
          }
         else{
             primeira = str.length()/2;
             str = str.substring(primeira,primeira + 1);
             System.out.println(str);
         }
         
         return str;
   
  }
}
