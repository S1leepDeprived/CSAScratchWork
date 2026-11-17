public class Practice09182026 {
public static void main(String[] args) {
      System.out.println(3/4);
      System.out.println(3.0/4);
      System.out.println((double)3/4);
      System.out.println((int) 3.0/4);
      
      double numberToRound = 3.499999;
      int roundedNumber = (int) (numberToRound + 0.5);
      System.out.println(roundedNumber);
      
      System.out.println(Integer.MAX_VALUE);
      int bigNumber = 2147483647;
      bigNumber = bigNumber +1;
      System.out.println(bigNumber);
   }
 }