/**
 * Regex
 */
public class Regex {

    public static void main(String[] args) {
        
        String str = "j";

        String num = "nm";

        String str1 = "ab";

        String str2 = "1";

        System.out.println(str.matches("."));       //🔸Output: true -- "." expression is for any single character

        System.out.println(num.matches("."));       //🔸Output: false

        System.out.println(str1.matches("[abc]"));  //🔸Output: false

        System.out.println(str2.matches("[a-z 0-9]"));      //🔸Output: true
        
    }
}