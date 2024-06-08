import java.util.Scanner;

/**
 * Find the factorial of number.. E.g int n = 5, So factorial of 5 will be 5 * 4 * 3 * 2 * 1
 */
public class FactorialOfNum {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)){

            System.out.println("Enter the value of n: ");

            int n = s.nextInt();
            
            int fact = 1;

            for (int i = 1; i <= n; i++){
                fact = fact * i;
            }
            System.out.printf("The factorial of %d is %d", n, fact);

        }
    }
}

//🔸Output: The factorial of 5 is 120