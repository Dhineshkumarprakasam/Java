import java.util.*;

public class Mancher
    static String modified(String s)
    {
        StringBuilder ss = new StringBuilder();
        ss.append('#');
        for(int i=0;i<s.length();i++)
            ss.append(s.charAt(i)).append('#');
        return ss.toString();
    }
    static int manch(String s)
    {
        String str = modified(s);

        int len = str.length();
        int c = 0;
        int r = 0;
        int maxlen = 0;
        int p[] = new int[len];

        for(int i=0;i<len;i++)
        {
            int mirror = 2*c-i;
            if(i<r)
                p[i]=Math.min(r-i,p[mirror]);
            
            int a = i+(1+p[i]);
            int b = i-(1+p[i]);

            while(a<len && b>=0 && str.charAt(a)==str.charAt(b))
            {
                p[i]++;
                b--;
                a++;
            }

            if(i+p[i]>r)
            {
                c=i;
                r=i+p[i];
            }

            maxlen = Math.max(maxlen,p[i]);
        }

        return maxlen;
    }
    public static void main(String[] args) {
        
        String str = "ababcbbcb";
        System.out.println("Length : "+manch(str));
    }
}
