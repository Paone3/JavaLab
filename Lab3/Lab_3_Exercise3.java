import java.util.Scanner;
class Replace_consonants 
{
       public String alterString(String str)
       {
              StringBuffer s1 = new StringBuffer(str);
              for(int i=0;i<str.length();i++)
              {
                     char c = s1.charAt(i);
                     if(!(c == 'A' || c =='a' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e'))
                     {
                           s1.replace(i,i+1,String.valueOf((char)(c+1)));
                     }
              }
              return s1.toString();
       }
}
class Lab_3_Exercise3
{
       public static void main(String[] ar)
       {
              Replace_consonants r = new Replace_consonants();
              Scanner s = new Scanner(System.in);
              System.out.println("Enter a string");
              String str = s.next();
              System.out.println(r.alterString(str));
       }
}