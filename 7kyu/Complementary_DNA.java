public class DnaStrand {
  public static String makeComplement(String dna) {
  
  String b = "";
  
  for(int i = 0; i < dna.length();i++){
            
            if(dna.charAt(i) == 'A'){
                b+= 'T';
            }
            else if (dna.charAt(i) == 'T'){
                b+= 'A';
            }
            else if (dna.charAt(i) == 'G'){
                b+= 'C';
            }
            else if (dna.charAt(i) == 'C'){
                b+= 'G';
            }
        }
        
    return b;
  }
}
