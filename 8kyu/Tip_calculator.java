public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {
    
    switch(rating.toLowerCase()){
      case "terrible":
      return (int) Math.ceil(amount * 0.00);
      case "poor":
      return (int)Math.ceil(amount * 0.05d);
      case "good":
      return (int)Math.ceil(amount * 0.1d);
      case "great":
      return (int)Math.ceil(amount * 0.15d);
      case "excellent":
      return (int)Math.ceil(amount * 0.2d);
      default:
      return null;
      
    }
    
  }
}
