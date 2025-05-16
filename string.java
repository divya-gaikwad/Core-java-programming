import java.lang.*;
import java.util.*;
class string
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter new string=");
		String name=sc.next();
		String n2=sc.next();
		//equals finction
		if(name.equals(n2))
		System.out.println("heeyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy:");
		else
		System.out.println("nottttttttttttttttttttt");
		// charAt fun //alternate
		for(int i=0;i<name.length();i=i+2)
		{
		System.out.println(name.charAt(i));
		}
		
		
	}
}
