class Thread1 implements Runnable
{
	int x=10;
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+x);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
	}
}

class RunThread
{
	public static void main(String s[])
	{
		Thread1 t1=new Thread1();
		
		Thread tt1=new Thread(t1,"thread1");
		tt1.start();
		
		Thread tt2=new Thread(t1,"thread2");
		tt2.start();
	}
}