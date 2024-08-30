import java.util.*;
public class strobo2
{
    static char find(char val)
    {
        if(val=='0')
            return '0';
        else if(val=='1')
            return '1';
        else if(val=='9')
            return '6';
        else if(val=='6')
            return '9';
        else if(val=='8')
            return '8';
        else
            return '-';
    }

    static boolean check(String number)
    {

        String strobed="";
        String reverse="";

        for(int i=0;i<number.length();i++)
        {
            if(find(number.charAt(i))=='-')
                return false;
            strobed+=find(number.charAt(i));
        }
        
        for(int i=strobed.length()-1;i>=0;i--)
            reverse+=strobed.charAt(i);
        
        if(number.equals(reverse))
            return true;
        return false;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no.of Digits : ");
        int n = input.nextInt();

        int start=1;
        int end=1;

        start=start*(int)Math.pow(10,n-1);
        end=end*(int)Math.pow(10,n);

        ArrayList<String> result = new ArrayList<>();
        for(int i=start;i<end;i++)
        {
            String number = String.valueOf(i);
            if(check(number)==true)
                result.add(number);
        }

        System.out.println(result);
        

    }
}
