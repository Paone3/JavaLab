import java.util.Scanner;
class SumOfCubes
{
	int cubesSum(int n)
		{
		int sum = 0;
		for(int i = 0 ;i <= n ;i++)
			{
			sum = sum+i*i*i;
			}
			return sum;
			}
			}
class Exercise1
	{
		public static void main(String[] args)
			{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Digit = ");
			int n = sc.nextInt();
			SumOfCubes sum = new SumOfCubes();
			int result = sum.cubesSum(n);
			System.out.println("The sum of the cubes of the digits of an n digit number is =  "+result);
			}
			}