/**
 * ObjectClassDemo
 */
public class ObjectClassDemo {

    public static void main(String[] args) {
        
        Object o1 = new Object();   // Object of mother class in java "Object"

        Object o2 = new Object();

        System.out.println(o1);     //🔸Output: java.lang.Object@5f71c76a -- Whenever we print any object it automatically call toString() method

        System.out.println(o1.equals(o2));      // 🔸Output: false 
    }
}