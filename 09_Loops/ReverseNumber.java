import java.util.Scanner;

/**
 * ReverseNumber
 */
public class ReverseNumber {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)){

            System.out.println("Enter the value of n: ");

            int n = s.nextInt();

            int rev = 0;

            int r;

            while (n > 0) {
                r = n % 10;
                rev = rev * 10 + r;
                n = n / 10;
        }
        System.out.print("Reversed Number: " + rev);
        }
          
    }
}
//🔸Output: Reversed Number: 5432