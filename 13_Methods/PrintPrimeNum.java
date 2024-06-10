import java.util.Scanner;

/**
 ◽ Print prime numbers from 1 to 100.
 */
public class PrintPrimeNum {

    static boolean numIsPrime (int n){
       
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)){
            System.out.println("Enter the value of n ");

            int n = s.nextInt();

            System.out.println("Prime numbers up to " + n + " are:");
            for (int i = 1; i <= n; i++){
                if (numIsPrime(i)){
                    System.out.print(i + " ");
                }
            }
        }
    }
}

/*
 🔸Prime numbers up to 100 are:
    1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
 */
