/*
  ThreadsDemo
 */
public class ThreadsDemo extends Thread {

    public void run()
    {
        int i = 1; 
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        ThreadsDemot t = new ThreadsDemo();

        t.start();
    }
}