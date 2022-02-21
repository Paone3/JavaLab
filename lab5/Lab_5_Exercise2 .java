import java.util.*;
class UserDefinedException extends Exception
{
}
public class Lab_5_Exercise2 {
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first name: ");
			String fName = sc.next();
			System.out.println("Enter the last name: ");
			String lName = sc.next();
			sc.close();
			try {
			if(fName.length()==0 || lName.length()==0)
			{
				System.out.println("NameException");
				throw new UserDefinedException();
			}
			else {
				System.out.println(fName+""+lName);
			}
			}
			catch(UserDefinedException e)
			{
				System.out.println("Enter Correct Name");
			}
	   }
}