/**
 ◽ Inter Thread Communication in Java is a mechanism that allows threads to communicate with each other. This is typically achieved using the wait(), notify(), and notifyAll() methods provided by the Object class.

So, here we are using Producer - Consumer example to illustrate Inter Thread Communication
 */
public class InterThreadComm {

    public static void main(String[] args) {
        
    }
}

class MyData
{
    int value;

   synchronized public void set(int v)
    {
        value = v;
    }

    synchronized public int get()
    {
        int x = 0;
        x = value;

        return x;
    }
}