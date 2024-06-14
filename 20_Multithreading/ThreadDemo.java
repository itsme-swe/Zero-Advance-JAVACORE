/**
 * Now we are not creating Thread Class but inherit properties and methods of Thread Class
 */
public class ThreadDemo extends Thread{

    public void run()
    {
        int i = 1; 
        while (true){
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        t.start();

        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
   
}