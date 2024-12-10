import java.util.HashSet;
import java.util.Scanner;

public class weighted {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter P : ");
        String p = sc.next();

        System.out.print("Enter Q : ");
        String q = sc.next();

        System.out.print("Enter K : ");
        int k = sc.nextInt();

        HashSet<String> hash = new HashSet<>();

        int n = p.length();

        for(int i=0;i<n;i++)
        {
            StringBuilder str = new StringBuilder();
            int sum = 0;
            for(int j=i;j<n;j++)
            {
                int pos = p.charAt(j)-'a';
                int value = q.charAt(pos) - '0';
                sum+= value;
                str.append(p.charAt(j));
                
                if(sum<=k)
                    hash.add(str.toString());
                else
                    break;
            }

            

        }

        for(String i : hash)
            System.out.print(i+" ");

        System.out.println("\nLen : "+hash.size());
    }
}
