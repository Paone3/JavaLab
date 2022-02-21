import java.util.*;
import java.io.*;
class Lab_3_Exercise5
{
   public static void main(String args[])throws IOException
    {
         int lines=1,words=0;           
         char ch;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter File name: ");
         String s1=sc.nextLine();
         FileInputStream file =new FileInputStream(s1);
                        int n=file.available();
                        for(int i=0;i<n;i++)
                        {
                              ch=(char)file.read();
                              if(ch=='\n')
                              lines++;
                              else if(ch==' ')
                              words++;
                                                                       
                        }
                        System.out.println("\nNumber of lines : "+lines);
                        System.out.println("\nNumber of words : "+(lines+words));
                        System.out.println("\nNumber of characters : "+n);
                       

            }
}
