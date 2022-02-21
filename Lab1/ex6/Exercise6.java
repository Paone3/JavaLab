import java.util.Scanner;
class Exercise6{
public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int difference = calculateDifference(n);
       System.out.println(difference);
}
      public static int calculateDifference(int n){
        
            int SumofSquares = (n*(n+1)*(2*n+1))/6;
            int Squares =(int)Math.pow(((n*(n+1))/2),2);
              int Sum = Squares - SumofSquares;
              return Sum;
}
}