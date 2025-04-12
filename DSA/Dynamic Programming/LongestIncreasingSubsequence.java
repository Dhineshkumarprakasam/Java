import java.util.*;
import java.io.*;

public class LongestIncreasingSubsequence
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,5,4));
        ArrayList<Integer> seq = new ArrayList<>();

        int n = arr.size();
        int ans[] = new int[n];
        int prev[] = new int[n];

        Arrays.fill(ans,1);
        Arrays.fill(prev, -1);

        for(int i=n-1;i>=0;i--)
            for(int j=(i-1);j>=0;j--)
                if(arr.get(i)>arr.get(j))
                    if(ans[j]<ans[i]+1)
                    {
                        ans[j] = ans[i]+1;
                        prev[j]=i;
                    }

        int max=ans[0];
        int index=0;

        for(int i=0;i<n;i++)
            if(ans[i]>max)
            {
                max=ans[i];
                index=i;
            }

        //sequence finding
        while(index!=-1)
        {
            seq.add(arr.get(index));
            index=prev[index];
        }

        System.out.println("Length : "+max);
        System.out.println("Sequence "+seq);
    }
}
