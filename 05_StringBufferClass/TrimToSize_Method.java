/**
 * TrimToSize_Method is used to trim the capacity of the buffer to be equal to the current length of the sequence. It helps to minimize memory usage if the buffer's capacity exceeds the actual length of the string it contains.
 */
public class TrimToSize_Method {

    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer(50);

        sb.append("Java Developer");

        System.out.println(sb.capacity());      //🔸Output: 50

        sb.trimToSize();

        System.out.println(sb.capacity());      //🔸Output: 14
    }
}