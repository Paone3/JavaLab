import java.util.Scanner;
class Exercise2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Choice \n Select one of three lights:\n 1.red\n 2.yellow\n 3.green\n");
		int choice = sc.nextInt();
		TrafficLightsLogic(choice);
	}
	public static void TrafficLightsLogic(int choice)
	{
		switch(choice)
		{
			case 1: System.out.println("Stop");
			break;
			case 2 : System.out.println("Ready");
			break;
			case 3 : System.out.println("Go");
			break;
			default:System.out.println("Invalid");

		}
	}
}
