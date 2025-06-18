import java.lang.*;
import java.util.*;
class studentinfo
{     int studno;
      String studname; 
      float m1,m2,m3,m4,m5,m6;
	void accept(int studno,String studname,float m1,float m2,float m3,float m4,float m5,float m6)
	{
	this. studno=studno;
      	this.studname=studname; 
      	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	this.m4=m4;
	this.m5=m5;
	this.m6=m6;
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
	studentinfo ob=new studentinfo();
	Scanner sc=new Scanner(System.in);
	System.out.println(" student info : ");
	int studno=sc.nextInt();
	String studname=sc.next();
	float m1=sc.nextFloat();
	float m2=sc.nextFloat();
	float m3=sc.nextFloat();
	float m4=sc.nextFloat();
	float m5=sc.nextFloat();
	float m6=sc.nextFloat();
	ob.accept(studno,studname,m1,m2,m3,m4,m5,m6);
	ob.display();
	ob.calculate();
	}
}