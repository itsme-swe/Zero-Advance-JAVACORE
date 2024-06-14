/**
 * Constructor Of Threads
 */
public class ConstructorOfThreads {

    public static void main(String[] args) {
        
        MyRun r = new MyRun("I am running");

        System.out.println("ID: " + r.threadId());       // Instead of getID() method we use "threadID()" since java 19  🟧 Output: ID: 23

        System.out.println("Thread Name: " + r.getName());              // 🟧 Output: Thread Name: I am running

        System.out.println("Thread Priority: " + r.getPriority());      // 🟧 Output: Thread Priority: 7 
        r.start();
        System.out.println("Thread State: " + r.getState());            // 🟧 Output: Thread State: RUNNABLE


    }
}

class MyRun extends Thread
{
    public MyRun (String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY-3);   
    }
}