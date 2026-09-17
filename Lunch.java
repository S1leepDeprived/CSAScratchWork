import java.util.Scanner;
public class Lunch {
   public static void main(String[] args) {
   int amountOfStudents = 20;
   double percentageOfLunchA = 0.5;
   boolean doYouHaveLunch = true;
   String whatLunch = "lunchB";
   
   
    System.out.println("Enter what lunch you have:");
      Scanner scan = new Scanner(System.in);
      whatLunch = scan.nextLine();
      System.out.println("You have: " +whatLunch);
      scan.close();
      
     System.out.println("There are " +amountOfStudents + " students in Both lunches");
     System.out.println("There are "+ amountOfStudents*percentageOfLunchA +" students in A lunch");

   }
  }
