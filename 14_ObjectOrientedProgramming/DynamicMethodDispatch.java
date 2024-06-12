/**
 * Dynamic Method Dispatch is a method where super class reference holding the method of sub class.
 */
public class DynamicMethodDispatch {

    public static void main(String[] args) {
        
        Parent p = new Child();
        p.display();    // Output: We are child class ---> Here the reference is created of super class and object of sub class but method will always get preference to object.
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
    @Override
    public void display()
    {
        System.out.println("We are child class");
    }
}