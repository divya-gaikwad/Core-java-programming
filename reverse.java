import java.lang.*;
class reverse
{

public static void main(String arg[])
{
 int d,s=0;
  int n=2468;
while(n>0)
{
	d=n%10;
	s=s*10+d;
	n=n/10;
}
System.out.print("number reverse="+s);
}
}