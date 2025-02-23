class sumofdigit
	{
	public static void main(String arg[])
	{
	int n=12345;
	int sum=0;
	while(n>0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("the sum of digits of the number is="+sum);
	}
	}