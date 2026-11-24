public class CountMultiples {
   public static int countMultiples(int large, int devisier) {
      int count = 0;
      for (int i = 0; i <= large; i++)
      {
         if(i % devisier == 0)
         {
            count++;
            //System.out.print(i);
         } 
      }
      return count;
   }
   
   public static void main(String args[]) {
      System.out.println(countMultiples(20, 3));
     // System.out.println(countMultiples(100, 5));
     // System.out.println(countMultiples(12, 4));
     // System.out.println(countMultiples(5, 10));
     // System.out.println(countMultiples(15, 1));
     //  System.out.println(countMultiples(7, 7));
     // System.out.println(countMultiples(10, 2));
     //  System.out.println(countMultiples(0, 3));
   
   }
}