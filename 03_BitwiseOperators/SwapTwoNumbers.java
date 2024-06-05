/**
 * SwapTwoNumbers
 */
public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.printf("The value of a is %d%n", a);     // "%d" stands for decimal number and "%n" is for new line
        System.out.printf("The value of b is %d", b);
    }
}

/*
🔸Output:
The value of a is 20
The value of b is 10
 */