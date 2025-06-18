import java.lang.*;
import java.util.*;
class empinfo
{
	int empno;
	String empname;
	float empsal;
	
	void accept(int empno,String empname,float empsal)//local and global variable values must be different
	{
	//global variable=local variable
	empno=empno;
	empname=empname;
	empsal=empsal;
	}

	void display()
	{
	System.out.println("Employee information :\n "+empno+"\n"+empname+"\n"+empsal);
	}
	public static void main(String arg[])
	{
	empinfo ob=new empinfo();
	ob.accept(101,"divya",10000);
	ob.display();

	}
}