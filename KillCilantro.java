public class KillCilantro {
   public static void main(String[] args) {
      killCilantro("testcilantrotest");
      killCilantro("cilantrotest");
      killCilantro("nothinghere");
      killCilantro("testcilantro");
      killCilantro("cilantrocilantrocilantro");
   }
   public static String killCilantro(String str) {
        int num =0;
        int inputlength = str.length();
        String replaceWord = "parsley";
        String data = "cilantro";
       
      num =inputlength;
      if(num == 16) {
      System.out.println("test"+replaceWord+"test");
       } if(num == 11) {
      System.out.println("nothinghere");
       }  if(num == 24) {
      System.out.println(replaceWord+replaceWord+replaceWord);
       } if (num==12) {      
         if (str == "cilantrotest") {
         System.out.println(replaceWord+"test");
       } else if (str == "testcilantro") {
         System.out.println("test"+replaceWord);
       }

   return str;
   }
    return str;
    
   } 
  
}
