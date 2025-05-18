import java.lang.*;
class local
{
	int a=90;
	int b;
	String diya;
	void me()
	{
	int a=80;
	System.out.println("value of a="+a);
	this.a++;
	System.out.println("value of a="+this.a);
	System.out.println("value of a="+a);

	}

	void tu(int a,int b,String diya)
	{
	this.a=a;
	this.b=b;
	this.diya=diya;
	System.out.println("value of a="+a);
	System.out.println("value of a="+b+"........"+diya);

	}
	public static void main(String arg[])
	{
	local ob=new local();

	ob.tu(12,12,"12");
	ob.me();
	
	
	
	}

}