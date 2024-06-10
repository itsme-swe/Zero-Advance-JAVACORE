import java.util.Scanner;

/**
 ◽ Find a numer is prime or not.
 */
public class NumIsPrime {

    static boolean isPrime (int n){
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                return false;
            }   
        }
        return true;
    }
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)){
            System.out.print("Enter the value to be checked: ");

            int n = s.nextInt();

            if (isPrime(n)){
                System.out.print("The numer is Prime");
            }
            else{
                System.out.println("The number is not prime");
            }   
        }
    }
}