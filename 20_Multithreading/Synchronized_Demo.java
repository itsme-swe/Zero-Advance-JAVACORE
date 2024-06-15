/**
 🟧 Synchronized_Demo --- synchronized keyword helps to make thread work one after one.
 */
public class Synchronized_Demo {

    public static void main(String[] args) {
        
        MyData data = new MyData();

        MyThread1 t1 = new MyThread1(data);

        MyThread2 t2 = new MyThread2(data);

        t1.start();
        t2.start();
    }
}

//🔸display() Method ---- To make Threads work in synchronized manner we just made the display method synchronized by using synchronized keyword.
class MyData
{
    synchronized public void display(String str)
    {
        for (int i = 0; i < str.length(); i++ ){
            System.out.print(str.charAt(i));
        }
    }
}

//🔸Thread 1
class MyThread1 extends Thread
{
    MyData d;   // Ref.of class MyData

    // constructor
    public MyThread1(MyData d)
    {
        this.d = d;
    }

    // run() method to start Thread
    public void run()
    {
        d.display("Hello!! ");
    } 
}

//🔸Thread 2
class MyThread2 extends Thread
{
    MyData d;   // Ref.of class MyData

    // constructor
    public MyThread2(MyData d)
    {
        this.d = d;
    }

    // run() method to start Thread
    public void run()
    {
        d.display("Welcome to the tech World");
    } 
}

/*
 ◽Output: Hello!! Welcome to the tech World
 */