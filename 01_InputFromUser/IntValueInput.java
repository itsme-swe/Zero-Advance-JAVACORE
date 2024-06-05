import java.util.Scanner;

public class IntValueInput {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int a , b, c;

        System.out.println("Enter 2 number: ");

        a = s.nextInt();
        b = s.nextInt();

        c = a + b;

        System.out.printf("The sum of %d and %d is: " + c, a,b);
    }
}