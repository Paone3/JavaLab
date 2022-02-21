import java.util.Scanner;
class Exercise5{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sum = CalculateSum(n); 
        System.out.println(Sum);
}
    public static int CalculateSum(int n)
    {
      int sum =0;
      for (int i = 0;i<=n;i++)
      {
       if(n%3 == 0 || n%5 == 0)
{
       sum = sum+n;
}
}
       return sum;
}
}
