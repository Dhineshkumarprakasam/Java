import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int min = Math.min(a, b);
        int gcd = 1;

        for(int i = 1; i <= min; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
    }
}
