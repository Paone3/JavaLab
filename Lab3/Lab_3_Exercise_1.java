import java.util.Scanner;
import java.util.StringTokenizer; 
class Lab_3_Exercise_1 {
    public static void main(String args[]) {
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of integers :");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            num = Integer.parseInt(temp);
            System.out.println(num);
            sum = sum + num;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
    }
}
