/**
  JoinMethod is the static method of String class.

  ◽Syntax: String.join(CharSequence delimter, charSequence...elements)

 */
public class JoinMethod {

    public static void main(String[] args) {
        String s = "Harsh";
        String s1 = "Juhi";
        String s2 = "Chellani";

        System.out.println(String.join("-", s,s1,s2));      //🔸Output: Harsh-Juhi-Chellani
    }
}