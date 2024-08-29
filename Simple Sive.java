import java.util.Scanner;
import java.util.*;
public class sive
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start : ");
        int s = input.nextInt();

        System.out.print("Enter End : ");
        int n = input.nextInt();

        boolean bool[] = new boolean[n];
        
        for(int i=0;i<n;i++)
            bool[i]=true;

        //finding primes
        for(int i=2;i<n;i++)
        {
            if(bool[i]==true)
                for(int j=(i*i);j<n;j+=i)
                    bool[j]=false;
        }

        //printing
        for(int i=s;i<n;i++)
            if(bool[i]==true)
                System.out.print(i+" ");
    }
}
