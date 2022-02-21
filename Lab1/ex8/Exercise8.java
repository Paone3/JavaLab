import java.util.Scanner;
class Exercise8{
public static boolean checkNumber(int number){
if(number%2 == 0)
{ 
    number/=2;
    return true;
 }
else
{
     return false;
}
}
public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       checkNumber(number);
       if(checkNumber(number))
           System.out.println("Entered number "+number+" is a power of two");
        else
         System.out.println("Entered number "+number+" is not a power of two");  
}
}
