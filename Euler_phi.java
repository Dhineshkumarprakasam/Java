import java.util.*;
public class Euler {
    static int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }

    static int phi(int n)
    {
        int result =1;
        for(int i=2;i<n;i++)
        {
            if(gcd(i,n)==1)
            {
                result++;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N : ");
        int n=input.nextInt();
        System.out.println(phi(n));
    }
}
