public class JadenCase {

	public String toJadenCase(String phrase) {
		
    if (phrase == null || phrase == ""){
    
       return null;
       }
       else {
    int next = 0;
    char[] arrayChar = phrase.toCharArray();
        for (int i = 0; i < phrase.length(); i++) {
            
            
            
            if (i == 0 || i == next ) {
                arrayChar[i] = Character.toUpperCase(arrayChar[i]);
            } else if (arrayChar[i] == ' ') {
              next = i+1;
                System.out.println(next);
            }

        }

        String ns = String.valueOf(arrayChar);

        return ns; }
		
		//return null;
	}

}
