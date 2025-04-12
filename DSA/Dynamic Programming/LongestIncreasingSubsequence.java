import java.util.*;

public class LongestIncreasingSubsequence
{
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,4,11,1,16,8));
        int n = arr.size();

        int dp[] = new int[n];
        int prev[] = new int[n];

        Arrays.fill(dp,1);
        Arrays.fill(prev, -1);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr.get(j)<arr.get(i) && dp[i]<1+dp[j])
                {
                    dp[i]=1+dp[j];
                    prev[i]=j;
                }
            }
        }

        int max=1,index=0;
        for(int i=0;i<n;i++)
        {
            if(dp[i]>max)
            {
                max=dp[i];
                index=i;
            }
        }

        ArrayList<Integer> seq = new ArrayList<>();
        while(index!=-1)
        {
            seq.add(arr.get(index));
            index=prev[index];
        }

        System.out.println("Length : "+max);
        System.out.println("Sequence : "+seq.reversed());
    }
}
