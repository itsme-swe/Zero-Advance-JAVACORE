/**
 * Reversing the below given string using "String Builder class"
 */
public class ReverseStringSB {

    public static void main(String[] args) {

        String s = "Honda";

        StringBuilder sb = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }

        String revString = sb.toString();

        System.out.println(revString);  
          
    }
}