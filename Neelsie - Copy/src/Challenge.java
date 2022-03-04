public class Challenge {
 
   public static void main(String[] args) {
                      // TODO Auto-generated method stub
      String s  = "1e2";
      String out ="";
      String num ="0123456789";
      
      for(int k =0;k<s.length();k++) {
      if(num.contains(String.valueOf(s.charAt(s.length()-k-1))) == false)
                 out = out+ s.charAt(s.length()-k-1);
                            
      }
      System.out.println("Final for loop 1: " + out);
      for(int k =0;k<s.length();k++)
      {if(num.contains(String.valueOf(s.charAt(k)))) {
                 
                 out = out.substring(0,k) + s.charAt(k) + out.substring(k);
                 }
                            System.out.println(out);
      }
      System.out.println("end result: " + out);
   }
           
}
