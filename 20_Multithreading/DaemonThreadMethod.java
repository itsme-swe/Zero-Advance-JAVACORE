/**
 * DaemonThread
 */
public class DaemonThreadMethod {

    public static void main(String[] args) {
        
        MyThread t = new MyThread("My thread 2");

        t.setDaemon(true);

        t.start();

        Thread mainThread = Thread.currentThread();
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
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
            System.out.println(count++);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}