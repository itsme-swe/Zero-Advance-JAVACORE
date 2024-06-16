/**
 * EnumDayDemo
 */
public class EnumDayDemo {

    public static void main(String[] args) {

        Day today = Day.FRIDAY;

        today.display();    // 🔸 FRIDAY 5


        System.out.println("Today is: " + today);

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week");
                break;

            case FRIDAY:
                System.out.println("End of the work week");
                break;

            case SUNDAY:
                System.out.println("Rest day of the week");
                break;
        
            default:
                System.out.println("Midweek days are so-so");
                break;
        }
    }
}

enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Constructor
    private Day()
    {
        System.out.println(this.name());
    }

    // Method
    public void display()
    {
        System.out.println(this.name() + " " + this.ordinal());
    }

    
}

/*
 ◽Output: 

    Today is: FRIDAY
    End of the work week
 */
