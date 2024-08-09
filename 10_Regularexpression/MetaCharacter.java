/**
 * MethaCharacter
 */
public class MetaCharacter {

    public static void main(String[] args) {
        String str = "a";

        String str1 = "$";

        String str2 = "b";

        System.out.println(str.matches("\\w"));     // 🔸Output: true --- "\w" stands for single alphabet or digit

        System.out.println(str1.matches("\\W"));    // 🔸Output: true --- "\W" stands for neither alphabet or digit

        System.out.println(str2.matches("\\d"));    // 🔸Output: false --- "\d" stands for single digit

    }
}