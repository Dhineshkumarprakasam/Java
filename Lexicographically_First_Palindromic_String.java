import java.util.*;

public class p9 {
    public static String find() {
        
        String s="aabcc";

        TreeMap<Character,Integer> tmap = new TreeMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }

        StringBuilder front = new StringBuilder();
        StringBuilder rear = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for(Map.Entry<Character,Integer> entry : tmap.entrySet())
        {
            char ch = entry.getKey();
            int val = entry.getValue();

            if(val%2==0)
                front.append(String.valueOf(ch).repeat(val/2));

            else if(val%2!=0)
            {
                if(val>2)
                    front.append(String.valueOf(ch).repeat((val-1)/2));
                odd.append(String.valueOf(ch)); 
            }

            else if(odd.length()>1)
            {
                return "";
            }
        }
        rear.append(front).reverse();
        return front.toString()+odd.toString()+rear.toString();
    }

    public static void main(String[] args) {
        System.out.println(find());
    }
}
