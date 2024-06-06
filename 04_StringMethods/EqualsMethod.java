/**
 * Equals Method is used to compare the content of the string and " == " used to compare the refrences 
 */
public class EqualsMethod {

    public static void main(String[] args) {
        String str1 = "java";

        String str2 = "java";

        String str3 = new String("java");

        System.out.println(str1.equals(str2));      // Output: true

        System.out.println(str1.equals(str3));      // Output: true  --- Here we are comparing contents by using equals() method

        System.out.println(str1 == str3);           // Output: false --- And here we are using refrences to compare and one object is in pool and another is in heap
    }
}