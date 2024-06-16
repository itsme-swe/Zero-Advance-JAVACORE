/**
 * EnumDemo
 */

public class EnumDemo {

    public static void main(String[] args) {
        
        Dept department = Dept.CIVIL;

       System.out.println( department.getHeadName());
        System.out.println(department.getLocation());

        // System.out.println(department.ordinal());       //🔸 ordinal() method return the index value of the enum

        // System.out.println(Dept.valueOf("ECE"));

        // // We can also create a list of all enums using array and for loop to iterate over it.
        // Dept [] list = Dept.values();
        // for (Dept x : list) {
        //     System.out.print(x + " ");      //🔸CS IT CIVIL ECE
        // }
    }
}

enum Dept
{
    CS("John", "Block A"), IT("Smith", "Block B"), CIVIL("Dave", "Block C"), ECE("Jonas", "Block D");

    String name;
    String location;

    // Parameter constructor
    private Dept(String head, String loc)
    {
        this.name = head;
        this.location = loc;
    }

    // Now getter method to access private constructors
    public String getHeadName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }
}