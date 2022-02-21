import java.util.*;
public class Lab_2_Exercise_2 {
	
	public static String[] sortStrings(TreeSet<String> arr) {
		
		int n = arr.size();
		String []str_arr = new String[n];
		str_arr = arr.toArray(str_arr);
		
		if(n%2 == 0)
		{
			for(int i=0;i<(n/2); i++)
				str_arr[i] = str_arr[i].toUpperCase();
			for(int i=(n/2); i<n; i++)
				str_arr[i] = str_arr[i].toLowerCase();
		}
		else
		{
			for(int i=0;i<(n/2)+1; i++)
				str_arr[i] = str_arr[i].toUpperCase();
			for(int i=(n/2 + 1); i<n; i++)
				str_arr[i] = str_arr[i].toLowerCase();
		}
		
		return str_arr;
	}

	public static void main(String[] args) {
		
		TreeSet<String> str = new TreeSet<>();
		str.add("Hello");
		str.add("Welcome");
		str.add("tO");
		str.add("the");
		str.add("Capgemini");
		
		
		
//		Object[] arr = str.toArray(); 
//		acceptSort(arr);
		String arr_result[] = sortStrings(str);
		
		for(String i: arr_result)
			System.out.print(i+ "  ");
		
	}

}
