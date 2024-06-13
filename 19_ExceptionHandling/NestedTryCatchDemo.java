/**
 ◽ Nested Try Catch program to handle exception handling
 */
public class NestedTryCatchDemo {

    public static void main(String[] args) {
        
        int arr[] = {30, 20 ,10, 40, 0};

        try {
            int c = arr[0] / arr[4];
            System.out.println("Division is " + c);

            // Nested try catch block 
            try {
                System.out.println(arr[4]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Index value" + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        }
        finally{
            System.out.println("Bye!!");
        }
    }
}