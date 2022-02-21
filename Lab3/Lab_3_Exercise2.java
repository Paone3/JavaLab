import java.util.Scanner;
class Logic
{
  public static String getImage(String str)
  {
    StringBuffer s1 = new StringBuffer(str);
    s1.append('|');
     StringBuffer s2 = new StringBuffer(str);
     s2.reverse();
     s1.append(s2);
     return s1.toString();  
  }
}
class Lab_3_Exercise2
{
    public static void main(String[] args)
     {
        Logic l = new Logic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println(l.getImage(str));
     }
}