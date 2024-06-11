/**
 * SuperKeyword
 */
public class SuperKeyword {

    public static void main(String[] args) {
        
        Child c = new Child(10, 20);
        
    }
}

class Parent
{
    public Parent()
    {
        System.out.println("Non-Parametier Constructor of Parent Class");
    }

    public Parent(int x)
    {
        System.out.println("Parameter Constructor of Parent Class " + x);
    }
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Non-Parameter Constructor of Child Class");
    }

    public Child(int y)
    {
        System.out.println("Parameter Constructor of Child Class");
    }

    public Child(int x, int y)
    {
        super(x);
        System.out.println("2 Param of Child " + y);
    }
}

/*
 🔸Output:
    Parameter Constructor of Parent Class 10
    2 Param of Child 20
 */