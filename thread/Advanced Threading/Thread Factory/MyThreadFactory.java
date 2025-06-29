import java.util.concurrent.*;

public class MyThreadFactory implements ThreadFactory
{
    
    public Thread newThread(Runnable r)
    {
        return new Thread(r);
    }

    public static void main(String[] args)
	{
        MyThreadFactory mtf = new MyThreadFactory();
        Thread t = mtf.newThread(new MyThread());
        t.start();
    }
}

class MyThread implements Runnable
{
    public void run()
	{
        System.out.println("Inside: " + Thread.currentThread().getName());
    }
}
