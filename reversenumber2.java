class reversenumber2
{
public static void main(String arg[])
{
int n=7890;
int d;
while(n>0)
{
	d=n%10;
	n=n/10;
	System.out.print(d);
}

}
}