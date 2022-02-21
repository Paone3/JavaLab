import java.util.Scanner;
class Array_Exercise_1{
public static int getSecondSmallest(int[] a){
            for (int i = 0; i < a.length; i++) {     
            for (int j = i+1; j < a.length; j++) {     
               if(a[i] > a[j]) {    
                  int temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp; 
                 }
                }
              }
           return a[1];
}
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Size of Array");
      int size = sc.nextInt();
      int[] a = new int[size];
      System.out.println("Array Elements");
      for(int i = 0; i < a.length;i++)
       {
          a[i] = sc.nextInt();
         }
  getSecondSmallest(a);
  System.out.println("The Second Smallest ="+getSecondSmallest(a));
}
}