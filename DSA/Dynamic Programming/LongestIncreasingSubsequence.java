import java.util.*;
import java.io.*;

public class LongestIncreasingSubsequence
{
    public static void main(String args[])
    {
        int arr[] = {5,4,11,1,16,8};
        int n = arr.length;

        int dp[]= new int[n];
        int hash[] = new int [n];
        Arrays.fill(dp,1);
        Arrays.fill(hash,-1);

        for(int i=0;i<n;i++)
        {
            for(int prev=0;prev<i;prev++)
            {
                if(arr[prev]<arr[i] && dp[i]<1+dp[prev])
                {
                    dp[i]=1+dp[prev];
                    hash[i]=prev;
                }
            }
        }

        int max=1;
        int idx=0;

        for(int i=0;i<n;i++)
        {
            if(dp[i]>max)
            {
                max=dp[i];
                idx=i;
            }
        }

        ArrayList<Integer> seq = new ArrayList<>();
        while(idx!=-1)
        {
            seq.add(arr[idx]);
            idx=hash[idx];
        }

        System.out.println("Length : "+max);
        System.out.println("Sequence : "+seq.reversed());
    }
}
