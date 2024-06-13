/**
 * ThrowThrow
 */
public class ThrowThrow {

    static int area(int l, int b) throws Exception
    {   
        if (l < 0 || b < 0 )
                throw new Exception();      // Creating Oject of Exception
        return l * b;
    }

    static void method1() throws Exception
    {
        System.out.println("Area is " + area(10, -5));
    }
    public static void main(String[] args) throws Exception {

        method1();
        
    }
}