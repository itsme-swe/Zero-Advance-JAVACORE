/**
 * ExceptionDemo
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 0;
        int c ;

        try {
            c = a / b;
            System.out.println(c);
            
            // Here ArithmeticException handles all are mathematical errors and "e" stands for perimeter
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0, try again!!" + e);
        }
        finally{
            System.out.println("Bye");
        }   
    }
}

/*
◽Output: 

    Denominator should not be 0, try again!!java.lang.ArithmeticException: / by zero
    Bye
 */