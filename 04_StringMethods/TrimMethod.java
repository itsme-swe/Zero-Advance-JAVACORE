import java.util.Scanner;

/*
 * TrimMethod is used to remove the left hand side white spaces
 */
public class TrimMethod {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Please enter your password: ");

            String pass = s.nextLine();

            System.out.println(pass.trim());
        }
    }
}