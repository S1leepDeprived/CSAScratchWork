public class Pen {
   String penColor = "purple";
   
   public Pen(); {
   }
   
   public Pen(String inkColor)
   public String write(String wordToWrite) {
      return "Writing in " + penColor + "ink: " +wordToWrite;
   }
   
   public String takeOffCap() {
      return "POP";
   }
}