public class Forpractice {
   public static void main(String[] args) {
     
      
     for (int counter = 0; counter <= 20; counter +=3) {
      System.out.println(counter);
     }
     
     String myString = "I like pancakes";
     for (int i = 0; 1<= myString.length() - 1; i++) {
      System.out.println("letter at index" + i + " is " + myString.substring(i,i+1));
     }
   }
   
}