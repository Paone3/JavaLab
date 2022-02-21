import java.util.Scanner;
class Lab_3_Exercise8{

       public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String");
            String s1 = sc.next();
            System.out.println(isPositive(s1));     
           }

       public static boolean isPositive(String s1){
            for(int i = 1;i < s1.length();i++)
              {
                if(s1.charAt(i) < s1.charAt(i-1))
                   {
                       return false;
                     }
              }
                      return true;                
           }
}

     
