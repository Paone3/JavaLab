package Exercise1;
import java.util.Scanner;
public class Exercise1 
{
	   public static void main(String args[]) 
	   {
		   Scanner sc = new Scanner(System.in);
		   Ex1 e = (x,y) -> 
		   {
			   return (int) Math.pow(x, y);
		   };
		   int x = sc.nextInt();
		   int y = sc.nextInt();
		   System.out.println(e.powerOfTwo(x, y));
	   }
}
