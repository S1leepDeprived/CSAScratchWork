public class BooleanPractice {
  public static void main(String[] args) {
      int num = 46;
      if (num <45) {
         System.out.println("num is less than 45!");
      } else  if (num == 45) {
         System.out.println("num is equal to 45");
      } else {
         System.out.println("num is greater than 45!");
      }
      
      if (false && true) {
         System.out.println("A");
      } else {
         System.out.println("B");
      }
      
      if ((2>2) && (10/0 > 1)) {
         System.out.println("A");
      } else {
         System.out.println("B");
      }
      
    

   }
   
}