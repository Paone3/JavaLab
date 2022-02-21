package Exercise2;

public class Exercise2 
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer();
		ex2 concat = (str1) -> {
			for(int i=0;i<str1.length();i++)
			{
				s.append(str1.charAt(i)+" ");
			}
			return s;
			
		};
		StringBuffer s2 = concat.str1("HelloWorld");
		System.out.println(s2);
	} 
}
