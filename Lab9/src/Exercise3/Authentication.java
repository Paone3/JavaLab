package Exercise3;

public class Authentication {

	public static void main(String[] args) 
	{
		String name = "HelloWorld";
		String pass = "hello1234";
		ex3 p = ((username,password)->{
			if(username.equals(name)&&password.equals(pass))
				return true;
			else
				return false;
		});
  System.out.println(p.authenticationCheck("HelloWorld","hello1234"));
	}

}
