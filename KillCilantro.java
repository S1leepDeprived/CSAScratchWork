public class KillCilantro {
   public static void main(String[] args) {
      System.out.println(killCilantro("testcilantrotest"));
     System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println(killCilantro("cilantrocilantrocilantro"));
     

   }
   public static String killCilantro(String str) {
        int num =0;
        int inputlength = str.length();
        String replaceWord = "parsley";
        String data = "cilantro";
        
                                    
        while (num < inputlength) {
        num++;
            if (num == inputlength) {
               str= str.replace("cilantro",replaceWord);
               }
            }
         
         return str;
      }
       
        
    
  
}
