/**
 🔸Printing MultiDimensionalArray using forEach loop 
 */
public class MultiDimensionalArray {

    public static void main(String[] args) {
        
        int [][] arr = {{1,2,3,4}, {5,6,7,8}, {6,5,4,3}};

        for (int x[] : arr){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

        
    }
}
/*
 🔸Output:

    1 2 3 4 
    5 6 7 8
    6 5 4 3
    
 */