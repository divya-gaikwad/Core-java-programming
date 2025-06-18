import java.lang.*;
import java.util.*;

class stuinfo
{     int studno;
      String studname; 
      float m1,m2,m3,m4,m5,m6;
	void accept()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println(" student info : ");
	studno=sc.nextInt();
	studname=sc.next();
	m1=sc.nextFloat();
	m2=sc.nextFloat();
	m3=sc.nextFloat();
	m4=sc.nextFloat();
	m5=sc.nextFloat();
	m6=sc.nextFloat();
	}
	void display()
	{
	System.out.println(" The information of the student is ::");
	System.out.println(studno+"\n"+studname);
	}
	void calculate()
	{
	float total=m1+m2+m3+m4+m5+m6;
	float percentage=total/6;
	System.out.println("total marks :"+total);
	System.out.println("total marks :"+percentage);
	}
	public static void main(String arg[])
	{
	stuinfo ob=new stuinfo();
	ob.accept();
	ob.display();
	ob.calculate();
	}

}