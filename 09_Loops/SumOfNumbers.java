import java.util.Scanner;

/**
 * Find the Sum Of Numbers
 */
public class SumOfNumbers {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            
            System.out.println("Enter the range of numbers: ");

            int n = s.nextInt();

            int sum = 0;

            for (int i = 0; i <= n; i++){
                sum = sum + i;
            }
            System.out.printf("The total sum of values is %d", sum);
        }
    }
}

//🔸Output: The total sum of values is 55