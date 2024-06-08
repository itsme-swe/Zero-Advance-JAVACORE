/**
◽Capacity_Method helps to know that how many characters can be stored inside string buffer object and when the default capacity gets full string buffer will automatically doubles the capacity.
 */
public class Capacity_Method {

    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer();

        StringBuffer sb1 = new StringBuffer("Helllo World");

        StringBuffer sb2 = new StringBuffer(50);    // Here we can set capacity of String Buffer by own.

        System.out.println(sb.capacity());      //🔸Default capacity of String Buffer is 16.

        System.out.println(sb1.capacity());      //🔸Default capacity of String Buffer is 16 and know after adding "Hello World" string the capacity will be 16 + length of string. So, here it is 28.

        System.out.println(sb2.capacity());     //🔸Output: 50 -- capacity initilised by the developer
    }
}