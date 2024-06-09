/**
 🔸 Passing Object As Parameter to a method means passing the reference to that object.
 */
public class PassingObjectAsPara {

    static void updateValue (int[] A){
        A[0] = 2;
    }

    public static void main(String[] args) {
        
        int[] arr = {5, 4, 6, 8, 10};

        System.out.print("Before updating the value of array: ");

        for (int x : arr){
            System.out.print(x + " ");
        }

        updateValue(arr);   // Calling method

        System.out.println();

        System.out.print("After updating the value of array: ");
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}

/*
 🔸Output: 
    
    Before updating the value of array: 5 4 6 8 10 
    After updating the value of array: 2 4 6 8 10
    
 */