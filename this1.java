// variable names are same then this keyword is used.............................
class this1
{	int a=10;
	void show()
	{
	int a=20;
	System.out.println("value 1 ="+a);
	System.out.println("value 2 ="+this.a);
	this.a=300;
	a=55;
	System.out.println("value 3="+a);
	System.out.println("value 4="+this.a);
	}
	void show1()
	{
	System.out.println("value 5="+this.a);
	System.out.println("value 6="+a);
	}
public static void main(String arg[])
{	this1 ob=new this1();
	ob.show();
	ob.show1();
}

}