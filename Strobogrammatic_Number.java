import java.util.*;
public class strobo{

    static boolean check(String value)
    {
        Map<Character,Character> map = new HashMap<>();
        map.put('1','1');
        map.put('0','0');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');


        StringBuilder topBottom = new StringBuilder();

        for(int i=0;i<value.length();i++)
        {
            char oppositeValue = map.getOrDefault(value.charAt(i),'-');
            if(oppositeValue=='-')
                return false;
            else
                topBottom.append(oppositeValue);
        }

        topBottom.reverse();

        if(value.equals(topBottom.toString()))
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        String value = input.nextLine();

        boolean ans = check(value);
        if(ans==true)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
