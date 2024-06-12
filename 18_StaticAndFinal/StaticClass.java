/**
 * StaticClass
 */
public class StaticClass {

    public static void main(String[] args) {
        
        Test t1 = new Test();
        t1.showMethod();

        t1.displayMethod();
        
    }
}

class Test
{
    static int x = 10;
    int y = 20;

    void showMethod()
    {
        System.out.println(x + " " + y);    // Non-static can access static variable
    }

    static void displayMethod()
    {
        System.out.println(x);     // But static method cannot access non-static variable, they only access static variables. Cannot access int y here.
    }
}