import java.util.Scanner;

/**
 * Find the number is Odd Or Even
 */
public class OddOrEven {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){

            System.out.print("Enter the value of n: ");

            int n = s.nextInt();

            if (n % 2 == 0) {
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }
        }
    }
}