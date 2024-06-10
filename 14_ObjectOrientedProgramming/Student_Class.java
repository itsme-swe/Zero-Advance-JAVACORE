/*
 ◽ Creating Student Class
 */
public class Student_Class {

    public static void main(String[] args) {
        
        Student s1 = new Student();

        s1.rollNo = 101;
        s1.name = "Harsh";
        s1.course = "Computer Science";
        s1.m1 = 50;
        s1.m2 = 70;
        s1.m3 = 70;

        System.out.println("Total:" + s1.total());
        System.out.println("Average: " + s1.average());
        System.out.println("Grade: " + s1.grade());
        System.out.println();
        System.out.println("Details of Student:\n" + s1.details());

    }
}

//🔸Studen Class

class Student
{
    int rollNo;
    String name;
    String course;
    int m1, m2, m3;

    public int total()
    {
        return m1 + m2 + m3;
    }

    public float average()
    {
        return (float)total() / 3;
    }

    public char grade()
    {
        if (average() >= 60)
                return 'A';
        else
            return 'B';
    }

    public String details()
    {
        return "Roll No: " + rollNo + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n" + "Grade: " + grade();
    }
}

/*
🔸Output:
    Total:190
    Average: 63.333332
    Grade: A

    Details of Student:
    Roll No: 101
    Name: Harsh
    Course: Computer Science
    Grade: A
 */