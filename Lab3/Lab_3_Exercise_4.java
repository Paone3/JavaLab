import java.util.Scanner;
public class Lab_3_Exercise_4{

	public static int modifyNumber(int number1) {
		StringBuffer sb = new StringBuffer();
		String str = Integer.toString(number1);
		for (int i = 0; i < str.length() - 1; i++) {
			int difference = (int) (str.charAt(i) - str.charAt(i + 1));
			sb.append(Math.abs(difference));
		}
		sb.append((int) Math.abs(str.charAt(str.length() - 1) - str.charAt(0)));
		return Integer.parseInt(sb.toString());
	}

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Number");
         int number = sc.nextInt();
	 System.out.println(modifyNumber(number));
	}

}