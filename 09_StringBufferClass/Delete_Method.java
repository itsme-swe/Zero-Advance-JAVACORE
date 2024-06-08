/**
 * Delete_Method takes parameter as startIndex and endIndex
 */
public class Delete_Method {

    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Sedan car");

        System.out.println(sb.delete(5, 9));        //🔸Output: Sedan

        System.out.println(sb.deleteCharAt(1));         //🔸Sdan
    }
}