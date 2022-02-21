import java.util.*;
class AgeNotValid extends Exception
{
	
}
public class Lab_5_Exercise_1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try
		{
			if(age<15)
			{
				System.out.println("Age is Not Valid");
				throw new AgeNotValid();
			}
			else
			{
				System.out.println("Age is Valid");	
			}
			
		}
		catch(AgeNotValid e)
		{
			System.out.println("Age Should be Above 15");	
		}
	}

}
