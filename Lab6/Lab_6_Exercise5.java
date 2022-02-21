import java.util.*;
class Lab_6_Exercise5
{
  public static int getSecondSmallest(int[] arr)
    { 
	  List <Integer>list1 = new ArrayList<Integer>();
	  for(int i :arr)
	  {
		  list1.add(i);
	  }
	   Collections.sort(list1);
	   int Second =list1.get(1);
      return Second;
    }
    public static void main(String[] args)
   {
     int[] arr = new int[] {34,6,367,77,4,8,3,87};
     getSecondSmallest(arr);
     System.out.println("The Second Smallest Number = "+getSecondSmallest(arr));
}
}