/**
 * Replace Method is used to replace the words from string 
 */
public class ReplaceMethod {

    public static void main(String[] args) {
        
        String name = "JUHI";

        String str = name.replace('I', 'U');

        System.out.printf("After using replace() method '%s' become '%s'", name, str);
    }
}

/*🔸Output:
    After using replace() method 'JUHI' become 'JUHU'
 */