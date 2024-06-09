import java.util.Arrays;

/**
 🔸 Here we are finding the sum of array using forEach loop
 */
public class SumOfArray {

    public static void main(String[] args) {
        
        int[] arr = {2, 4, 6, 8, 10};

        int sum = 0;

        for (int x : arr){
            sum = sum + x;
        }
        System.out.printf("The sum of array %s is %d", Arrays.toString(arr), sum);
    }
}

// 🔸Output: The sum of array [2, 4, 6, 8, 10] is 30