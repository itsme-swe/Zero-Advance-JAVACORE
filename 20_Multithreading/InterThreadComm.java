/**
 ◽ Inter Thread Communication in Java is a mechanism that allows threads to communicate with each other. This is typically achieved using the wait(), notify(), and notifyAll() methods provided by the Object class.

So, here we are using Producer - Consumer example to illustrate Inter Thread Communication
 */
public class InterThreadComm {

    public static void main(String[] args) {
        
        MyData data = new MyData();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();


    }
}

class MyData
{
    int value;
    boolean flag = true;    // flag to manage the turn (true for Producer, false for Consumer)

    // Synchronized method for Producer to set value
   synchronized public void set(int v)
    {
        while (flag != true) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        value = v;
        flag = false;   // Here when the flag becomes false it means now it's consumer turn
        notify();
    }

    synchronized public int get()
    {
        int x = 0;
        while (flag != false) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);            }
        }
        x = value;
        flag = true;
        notify();

        return x;
    }
}

class Producer extends Thread
{
    MyData data;

    public Producer(MyData d)
    {
        data = d;
    }

    public void run()
    {
        int count = 1;
        while(true){
            data.set(count);
            System.out.println("Producer " + count);
            count++;
            try {Thread.sleep(1000);}catch(Exception e){};
        }
    }
}

class Consumer extends Thread
{
    MyData data;

    public Consumer(MyData d)
    {
        data = d;
    }

    public void run()
    {
        int value = 1;
        while(true){
            value = data.get();
            System.out.println("Consumer " + value); 
            try {Thread.sleep(1000);}catch(Exception e){};
        }
    }
}

/*
 🔸 Output: 

    Consumer 1
    Producer 1
    Consumer 2
    Producer 2
    Producer 3
    Consumer 3
    Producer 4
    Consumer 4
    Producer 5
    Consumer 5
    
 */