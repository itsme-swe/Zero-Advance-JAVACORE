import java.time.LocalDate;

/**
 * Creating class which will generate roll numbers automatically
 */
public class StudentClassDemo {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
    }
}

class Student
{
    private String rollNo;

    private static int count = 101;

    // Method will genrate rollNo automatically
    private String assignRollNo()
    {
         LocalDate currentDate = LocalDate.now();
         String rNo = "Unv-" + currentDate.getYear() + "-" + count;
         count++;
         return rNo;
    }

    Student()
    {
        rollNo = assignRollNo();
    }

    public String getRollNo()
    {
        return rollNo;
    }
}

/*
 🔸Output:
    Unv-2024-1
    Unv-2024-2
    Unv-2024-3
 */