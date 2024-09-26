import java.util.Scanner;

import java.util.*;

public class booth
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Enter n1 : ");
        int n1 = input.nextInt();

        System.out.print("Enter n2 : ");
        int n2 = input.nextInt();

        int m = n1;
        int r = n2;
        int a = n1;
        int s = -n1;
        int p = 0;
        int count = Integer.SIZE;

        while(count>0)
        {
            if((r & 1)==1)
            {
                p+=a;
                s+=m;
            }
            a<<=1;
            s<<=1;
            count--;
            r>>=1;
        }
        System.out.println(p);   
    }
}
