import java.util.*;
public class binaryp
{
    static boolean check(int n)
    {
        String num = Integer.toBinaryString(n);
        int l=0;
        int h=num.length()-1;

        while(l<=h)
        {
            if(num.charAt(l)!=num.charAt(h))
                return false;
            l++;
            h--;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = input.nextInt();

        System.out.println(check(num));
    }
}
