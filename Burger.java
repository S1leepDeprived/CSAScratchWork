public class Burger {
   // instance variables
   private int numPatties;
   private  boolean isTasty;
   private double gramsOfSauce;
   private String burgerName;
   private int numberOfBites;
   
   // constructors
   // first let's do the no-argument constructor
   public Burger() {
      numberOfBites = 0;
      numPatties = 2;
      isTasty = true;
      gramsOfSauce = 30;
      burgerName = "Craig the Burger";
   }
   
   public Burger(int numPatties, boolean isTasty, double gramsOfSauce, String burgerName) {
      this.numberOfBites = 0;
      this.numPatties = numPatties;
      this.isTasty = isTasty;
      this.gramsOfSauce = gramsOfSauce;
      this.burgerName = burgerName;
   }
   
   //Methods go here
   public void bite() {
      System.out.println("Chomp...");
      numberOfBites++;
   }
   
   public int getNumberOfBites() {
      return numberOfBites;
   }
   
   public static String getBurgerRecipe() {
      return "cook burger, put on bun, add condiments";
   }
   
   public static void main(String[] args) {
      //create a burger object using the no argument constructor
      Burger basicBurger = new Burger();
      //create a burger object using the constroctor with arguments
      Burger newBurger = new Burger(3,true,45,"newest Burger");
      //take bite out of either burger
      newBurger.bite();
      newBurger.bite();
      newBurger.bite();
      newBurger.bite();
      newBurger.bite();
      //get the number of bites taken out of the burger
      System.out.println(newBurger.getNumberOfBites());
      //call the class method "getburgerrecipe()"
      System.out.println(Burger.getBurgerRecipe());
     
   }
}