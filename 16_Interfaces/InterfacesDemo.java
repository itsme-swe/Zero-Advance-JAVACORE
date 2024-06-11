/**
 🔸 InterfacesDemo -- In interfaces classes use "implements keyword" instead of extends to inherit the properties and behaviour of interfaces. 
 */
public class InterfacesDemo {

    public static void main(String[] args) {
        Test t = new Test1();

        Test1 t1 = new Test1();

        t.meth1();

        t.meth2();

        // t.meth3();   -- Here we'll get error bcoz we cannot create object with the help of refernce of super class
        t1.meth3();     // Need reference of sub class only to call the method of sub class

    }
}

interface Test
{
    public void meth1();
    public void meth2();
}

class Test1 implements Test
{
    public void meth1()
    {
        System.out.println("Meth1 of class Test1");
    }

    public void meth2()
    {
        System.out.println("Meth2 of class Test1");
    }

    public void meth3()
    {
        System.out.println("Meth3 of class Test1");
    }
}

/*
🔸Output: 
    Meth1 of class Test1
    Meth2 of class Test1
 */ 