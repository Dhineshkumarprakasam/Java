import java.util.*;

public class LongestCommonSubsequence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();

        int n = a.length();
        int m = b.length();

        int lcs[][] = new int[n+1][m+1];

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                    lcs[i][j]=1+lcs[i-1][j-1];
                else
                    lcs[i][j]= Math.max(lcs[i][j-1],lcs[i-1][j]);
            }
        }

        System.out.println("The LCS : "+lcs[n][m]);
    }
}
