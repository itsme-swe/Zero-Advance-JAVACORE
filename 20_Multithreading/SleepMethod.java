/**
 ◽ We use Sleep Method to suspend the thread for a particular amount of time.
 */
public class SleepMethod {

    public static void main(String[] args) {
        
        MyThread t = new MyThread("I am thread 1");

        t.start();
        t.interrupt();      // interrupt() method to interrupt a particular thread. It also causes it to continue execution if it was blocked for any reason.
    }
}

class MyThread extends Thread
{   
    // Constructor
    public MyThread (String name)
    {
        super(name);
    }

    public void run()
    {
        int count = 1;

        while (count <= 20) {
            System.out.print(count++ + " ");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}