import java.util.*;
class empinfo25
{
	int emp_no;
	String emp_name;
	float emp_salary;

	void accept(int eno,String name,float salary)
	{
	emp_no=eno;
	emp_name=name;
	emp_salary=salary;
	}
	void display()
	{
	System.out.println("EMPLOYEE INFORMATION");
	System.out.println("employee number="+emp_no);
	System.out.println("employee name="+emp_name);
	System.out.println("employee salary="+emp_salary);
	}
	public static void main(String arg[])
	{
	
	empinfo25 ob=new empinfo25();
	Scanner sc=new Scanner(System.in);
	System.out.println("entre number name salary");
	int eno=sc.nextInt();
	String name=sc.next();
	float salary=sc.nextFloat();

	ob.accept(eno,name,salary);
	ob.display();
	}
}