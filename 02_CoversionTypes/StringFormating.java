import java.util.Scanner;

/**
 * String Formating in java using printf()
 */
public class StringFormating {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = s.nextInt();

        s.nextLine();   // // Consumes the leftover newline character

        System.out.println("Enter your full name: ");
        String name = s.nextLine();

        System.out.println("Enter your weight: ");
        float weight = s.nextFloat();

        System.out.printf("Hello My name is %s and I am %d years old. At the age of 32 my weight is %2.1f kg.", name, age, weight);


    }
}

/*
🔸output: 
Enter your age: 
32
Enter your full name: 
Harsh Mehra
Enter your weight: 
69.5

Hello My name is Harsh Mehra and I am 32 years old. At the age of 32 my weight is 69.5 kg.
 */