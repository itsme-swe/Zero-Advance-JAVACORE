/**
 * EqualsIgnoreCase_Method used to ignore the upper and lower cases.
 */
public class EqualsIgnoreCase_Method {

    public static void main(String[] args) {
        String s = "Harsh";

        String s1 = "harsh";

        System.out.println(s.equalsIgnoreCase(s1));     //🔸Output: "true" bcoz "equalsIgnoreCase()" method ignore ther upper and lower cases. 
    }
}