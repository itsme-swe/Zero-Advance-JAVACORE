import java.util.Scanner;

/**
 * Searching an Element in given arrayusing Linear Search 
 */
public class SearchingElement {

    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)){
            System.out.print("Enter the element to be searched from array: ");

            int key = s.nextInt();

            int [] arr = {10, 20, 25, 30, 35, 5, 15};

            for (int i = 0; i < arr.length; i++){
                if (arr[i] == key){
                    System.out.println("Key found at index: " + i);
                    System.exit(0);
                }
            }
            System.out.println("Key not present in the array");
        }
    }
}