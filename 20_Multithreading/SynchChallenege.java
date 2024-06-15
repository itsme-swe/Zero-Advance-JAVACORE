/**
 ◽ Its an practice exercise of Synchronize method. Here we write to class for ATM machine where ATM machine is an single object and customers are multiple threads. 
 */
public class SynchChallenege {

    public static void main(String[] args) {
        
        ATM atm = new ATM();

        Customer  c1 = new Customer("Harsh", atm, 10000);
        Customer c2 = new Customer("Mukul", atm, 12000);

        c1.start();
        c2.start();
    }
}

//🔸Creating class for ATM
class ATM
{
   synchronized public void checkBalance(String name)
    {
        System.out.println(name + " Checking ");

        // Making thread to slow down for 1000 milliseconds
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.print(e);
        }

        System.out.println("Balance");
    }

    synchronized public void withdraw(String name, int amt)
    {
        System.out.println(name + " withdrawing ");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(amt);
    }
}

class Customer extends Thread
{
    String name;
    int amount;
    ATM atm;

    Customer (String n, ATM a, int amt)
    {
        name = n;
        atm = a;
        amount = amt;
    }

    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run()
    {
        useATM();
    }
}

/*
 ◽output: 
    Harsh Checking 
    Balance
    Harsh withdrawing 
    10000
    Mukul Checking
    Balance
    Mukul withdrawing
    12000
 */