import java.util.scanner;

public class WhilePractice {
   public static void main(String[] args) {
      scanner in = new Scanner(System.in);
      String statement = in.nextlin();
      
      while (!statement.equals("Bye")) {
         System.out.println(statement);
         statement = in.nextline();
      }
        
      
   }
}