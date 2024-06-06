import java.util.Scanner;

/**
 * StringInput
 */
public class StringInput {

    public static void main(String[] args) {
        
        try (Scanner str = new Scanner(System.in)) {
            System.out.print("Enter your full name: ");

            String name = str.nextLine().toUpperCase();

            System.out.printf("Welcome to the program Mr.%s", name);
        }
    }
}