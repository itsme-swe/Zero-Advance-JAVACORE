/**
 🟡 This is the second method Runnable Interface to achieve multithreding in java the only difference in Thread class and Runnable interface is interface implements not extends
 */
public class RunnableInterfaceTest implements Runnable {

    public void run()
    {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        
        // And, in the main method first we need to create an object of Runnable interface
        RunnableInterfaceTest t = new RunnableInterfaceTest();

        // Then its important to create Thread class oject and pass reference of Runnable interface object 
        Thread th = new Thread(t);

        th.start();

        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}