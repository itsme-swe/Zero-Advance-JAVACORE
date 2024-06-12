/**
 * Constructor_Method
 */
public class Constructor_Method {

    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(10,5);

        System.out.println(r);

        


    }
}

class Rectangle
{
     double length;
     double breadth;

    //🔸Constructors
    public Rectangle()
    {
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
}