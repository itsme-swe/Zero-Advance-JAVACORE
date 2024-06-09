/**
 * Method_Creation
 */
public class Method_Creation {

    static int max (int a, int b){
        if (a > b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {

        int a = 10;

        int b = 20;

        int c;

        c = max(a, b);

        System.out.printf("The maximum number between a and b is %d",c);
        
    }
}