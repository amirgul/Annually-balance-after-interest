import java.util.Scanner;

public class Main
{

    public static final double INTEREST_RATE = 0.10;
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter you balance in saving account");
        double  balance = keyboard.nextDouble();
        for(int i = 1; i<= 12; i++)
        {
            balance = balance + (INTEREST_RATE*balance)/12.0;
            System.out.println("For month " + i +" your balance is: " + balance);
            System.out.println("If you withdraw or deposit");
            System.out.println("enter positive number for deposit");
            System.out.println("Enter a negative number for withdraw");
            double amount = keyboard.nextDouble();
            balance = balance + amount;
            System.out.println("your balance after withdraw or deposit: "+balance);


        }
        System.out.println("your total balance is going to be: " + balance);

    }
}
