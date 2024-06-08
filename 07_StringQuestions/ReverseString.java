/**
 * Reversing String using String Class
 */
public class ReverseString {
    public static void main(String[] args) {
        
        String s = "Honda";

        String rev = "";

        for (int i = s.length()-1; i >= 0; i--){

            rev = rev + s.charAt(i);

        }
        System.out.println("Reversed order of string: " + rev);     //🔸Output: Reversed order of string: adnoH
    }
    
}