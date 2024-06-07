import java.util.Scanner;

/**
 * WhileLoop
 */
public class WhileLoop {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value for n: ");

            int n = sc.nextInt();

            int i = 1;

            while (i < n) {
                System.out.print(i + " ");
                i *= 2;
            }
        }
    }
}

//🔸Output: 1 2 4 8 16 32 64 