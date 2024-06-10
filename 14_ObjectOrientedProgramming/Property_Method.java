/**
 ◽ With the help of Property_Method we can access private properties of object. Getter() and Setter() 
 */
public class Property_Method {

    public static void main(String[] args) {
        
        Rectangle r = new Rectangle();

        r.setLength(10.5);
        r.setBreadth(5.5);

        System.out.println("Area " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println();
        System.out.println("Length: " + r.getLength());
        System.out.println("Breadth: " + r.getBreadth());


    }
}

//🔸Rectangle Class
class Rectangle
{
    private double length;
    private double breadth;

    //🔸 getter() method
    public double getLength()
    {
        return length;
    }

    public double getBreadth()
    {
        return breadth;
    }

    //🔸setter method
    public void setLength(double l)
    {
        length = l;
    }

    public void setBreadth(double b)
    {
        breadth = b;
    }

    public double area()
    {
        return length * breadth;
    }

    public double perimeter()
    {
        return 2 * (length + breadth);
    }
}

/*
🔸output:
    Area 57.75
    Perimeter: 32.0
    
    Length: 10.5
    Breadth: 5.5

 */