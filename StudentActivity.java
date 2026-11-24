public class StudentActivity {

   //instance variables 
   private String name;   
   private String category;  
   private int numberOfStudents;  
   private double financialRequirements;  
   private double fundsAvaible;
   private double meetingCost;
   private boolean scholarshipsAvailable;
   
   //constuctors
   public StudentActivity(String name, String category, int numberOfStudents, double financialRequirements, boolean scholarshipsAvailable, double fundsAvaible, double meetingCost) {
      this.name = name;
      this.category = category;
      this.numberOfStudents = numberOfStudents;
      this.financialRequirements = financialRequirements;
      this.scholarshipsAvailable = scholarshipsAvailable;
      this.fundsAvaible = fundsAvaible;
      fundsAvaible = 100.00;
      meetingCost = 10.00;
   }  
   //creating this consutructor to support a form submission that is the name of the club and the catagory
   //method
   public void meet() {
      //decrement the fundsAvaible by the monthly meeting cost
      fundsAvaible -= meetingCost;
      System.out.println("Subracted " + meetingCost + " from fundsAvailble. Funds remaining: " + fundsAvaible);
   }
}