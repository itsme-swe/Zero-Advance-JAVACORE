/**
 ◽ Defining our own Thread class first
 */


public class ThreadTest {

    public static void main(String[] args) {
        
        MyThread t = new MyThread();    // Object of MyThread class
        t.start();

        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}

// 🔸User-defined Thread Class

class MyThread extends Thread
{
    public void run()
    {
        int i = 1; 
        while (true){
            System.out.println(i + " Hello");
            i++;
        }
    }
}