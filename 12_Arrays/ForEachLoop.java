/**
 * ForEachLoop
 */
public class ForEachLoop {

    public static void main(String[] args) {
        
        int[] arr = {2, 4 ,6 ,8, 10};

        int [] arr1 = {3, 5, 7, 9, 11};

        //🔸Traditional loop
        System.out.print("Traditional Method: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //🔸forEach loop
        System.out.print("forEach Loop: ");
        for (int x : arr1){
            System.out.print(x + " ");
        }
    }
}

/*
 🔸Output:
    
    Traditional Method: 2 4 6 8 10 
    
    forEach Loop: 3 5 7 9 11 
 */