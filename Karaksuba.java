import java.util.*;

public class karaksuba
{

    static int getdigits(int n)
    {
        if(n==0)
            return 1;

        int d=0;

        int lastd;
        while(n>0)
        {
            lastd=n%10;
            n=n/10;
            d+=1;
        }
        return d;
    }

    public static int karak(int x, int y)
    {
        if(x<10 || y<10)
        {
            return x*y;
        }

        int m=Math.max(getdigits(x),getdigits(y));
        int halfM = m/2;

        int powerOf10 = (int) Math.pow(10,halfM);

        int a = x/powerOf10;
        int b = x%powerOf10;

        int c = y/powerOf10;
        int d = y%powerOf10;

        int ac = karak(a, c);
        int bd = karak(b,d);
        int abcd = karak(a+b,c+d);

        int result = ac * (int)Math.pow(10,m) + (abcd - ac - bd) *powerOf10 + bd;

        return result;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n1 : ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2 : ");
        int n2 = sc.nextInt();

        System.out.println(n1+" * "+n2+" = "+karak(n1,n2));
    }

}
