import java.util.*;
class sumofnum
{
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int n,i,sum=0;
	System.out.println("enter num for sum of numbers upto n:");
	n=sc.nextInt();
	for(i=0;i<=n;i++)
	{
	sum=sum+i;	
	}
	System.out.println("sum is = "+sum);
}}
