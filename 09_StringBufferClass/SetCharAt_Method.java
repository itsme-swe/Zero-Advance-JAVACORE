/**
 * SetCharAt_Method is used to set the character at the specified index to a new character.
 */
public class SetCharAt_Method {

    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello World");

        sb.setCharAt(1, 'o');

        System.out.println(sb);     //🔸Output: Hollo World
    }
}