import java.util.Scanner;
class Exercise7{
public static boolean checkNumber(int n){
   while(n > 0)
       {
         int digit = n%10;
         n = n/10;
         if(digit < n%10)
             return false;
                   }
            return true;
}
public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       checkNumber(n);
       if(checkNumber(n))
       System.out.println(n+" is increasing order");
       else
       System.out.println(n +" is not increasing order");  
}
}
