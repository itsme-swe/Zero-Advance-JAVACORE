/**
 * Append_Method is used to add element inside the string and when we add some elements using string buffer no ew object will be created in heap.
 */
public class Append_Method {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        System.out.println(sb.capacity());          //🔸Output: capacity is 16

        sb.append("Harsh");
        
        System.out.println(sb.capacity());          //🔸Output: capacity is 16

        sb.append(" Mehra own car");         //🔸Output: capacity is 16

        System.out.println(sb.capacity());          //🔸Output: capacity is 34  --- "default capacity (16 * 2 + 2) = 34" 

    
    }
}