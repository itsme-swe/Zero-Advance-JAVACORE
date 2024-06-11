/**
 * MethodOverriding
 */
public class MethodOverriding {

    public static void main(String[] args) {
        
        Child c = new Child();

        c.display();        // We are child class ----> The super class method has been shadowed and this is known as Method Overriding. 
    }
}

class Parent
{
    public void display()
    {
        System.out.println("We are parent class");
    }
}

class Child extends Parent
{
    public void display()
    {
        System.out.println("We are child class");
    }
}