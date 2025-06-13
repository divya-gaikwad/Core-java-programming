import java.lang.*;
class reverse11
{
public static void main(String arg[])
{
int n=1234567890 ;
int s=0;
while(n>0)
	{
	int d=n%10;
	s=s*10+d;
	n=n/10;
	}
	System.out.println("reverse"+s);

}

}