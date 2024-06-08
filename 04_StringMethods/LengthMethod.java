import java.util.Scanner;

public class LengthMethod {

    public static void main(String[] args) {
           try(Scanner s = new Scanner(System.in)){

            System.out.println("Enter your car name: ");

            String carName = s.nextLine();

            int len = carName.length();

            System.out.println("Number of letters present in you car: " + len);

            // Method: 1
            /* if (len == 0){
                 System.out.println("CarName field is Empty");
             } */

            // Method: 2
            if (carName.isEmpty() == true){
                System.out.println("Car name field cannot be empty");
            }
            else{
                System.out.printf("Your car %s is ready to go.", carName);
            }
           }

    }
}