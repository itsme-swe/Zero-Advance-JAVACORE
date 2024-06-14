/**
 * DaemonThread
 */
public class YieldMethod {

    public static void main(String[] args) {
        
        MyThread t = new MyThread("My thread 2");
        t.start();

        int count = 1;

        while (count <= 15) {
            System.out.println(count++ + "Main");
            Thread.yield();
        }
        
    }
}

class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        int count = 1;

        while (count <= 15) {
            System.out.println(count++ + "My thread");
        
        }

    }
}