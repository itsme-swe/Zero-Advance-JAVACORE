/**
 ◽ Creating class for Circle
 */

public class OOPs_Class {

    public static void main(String[] args) {
        
        Circle c1 = new Circle();   // object of class Circle

        c1.radius = 7;

        System.out.println(c1.area());
        System.out.println();
        System.out.println(c1.perimeter());
    }
}

class Circle 
{
    public double radius;       // property

    // Method
    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}