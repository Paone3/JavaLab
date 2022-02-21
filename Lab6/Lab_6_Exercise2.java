import java.util.*;
class Lab_6_Exercise2 {
	public static Map<Character,Integer> countChars(char[] arr)
      {
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				Integer n = map.get(arr[i]);
				map.put(arr[i],n++);
			}
			else 
			{
				map.put(arr[i],1);
			}
		}
		return map;	
}
	public static void main(String[] args)
	{
		char[] arr = {'A','B','C','D','E','E','A','F','B','C'};
		System.out.println(countChars(arr));
	}
}
