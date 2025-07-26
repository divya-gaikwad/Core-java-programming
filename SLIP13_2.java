/*Write a Java program to show lifecycle (creation, sleep, and dead) of a thread. Program should print randomly the name of thread and value of sleep time. The name of the thread should be hard coded through constructor. The sleep time of a thread will be a random integer in the range 0 to 4999.*/
import java.util.Random;
public class SLIP13_2 extends Thread
{ 	Thread th;
	String s1;
	SLIP13_2(String s1)
	{
		th=new Thread(this);
		th.start();
		this.s1=s1;
	}
	public void run()
	{
		while(true)
		{
			try{
				Random r1=new Random(4999);
				int a=r1.nextInt();
				sleep(a);
				System.out.println("name of thread"+s1+"sleep time"+a);
				}catch(Exception e)
					{
						System.out.println(e);
					}
			}
	}

	public static void main(String[] args)
	{
		SLIP13_2 ob=new SLIP13_2("thread 1");
		SLIP13_2 ob2=new SLIP13_2("thread2");
		
	}

}
