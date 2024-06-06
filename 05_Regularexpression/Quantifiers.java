/**
 * Quantifiers
 */
public class Quantifiers {

    public static void main(String[] args) {
        
        String str = "abcde";

        String str1 = "abcdef";

        System.out.println(str.matches(".*"));      // 🔸Output: true

        System.out.println(str1.matches("[a-z]*")); // 🔸Output: true
    }
}