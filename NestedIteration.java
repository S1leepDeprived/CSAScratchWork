public class NestedIteration {
   public static void main(String[] args) {
      for (int i = 1; i <= 5; i++) {
         for (int j = 0; j<4; j++) {
         System.out.println(j+","+i+" ");
            if (j==3) {
             System.out.println();    
           }
           
           
         }
      }
   }
}