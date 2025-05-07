import java.util.*;

public class LongestBitonicSubsequence{
    public static int[] lds(int arr[])
    {
        int n = arr.length;
        int lds[] = new int[n];
        int prev[] = new int [n];

        Arrays.fill(lds,1);
        Arrays.fill(prev,-1);

        for(int i=n-1;i>=0;i--)
        {
            for(int j=n-1;j>i;j--)
            {
                if(arr[i]>arr[j] && lds[i]<lds[j]+1)
                {
                    lds[i]=lds[j]+1;
                    prev[i]=j;
                }
            }
        }

        int maxi=0;
        for(int i=0;i<n;i++)
            if(lds[i]>lds[maxi])
                maxi=i;
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(maxi!=-1)
        {
            ans.add(arr[maxi]);
            maxi=prev[maxi];
        }

        System.out.println("Longest decreasing : "+ans);
        return lds;
    }

    public static int[] lis(int arr[])
    {
        int n = arr.length;
        int lis[] = new int[n];
        int prev[] = new int [n];

        Arrays.fill(lis,1);
        Arrays.fill(prev,-1);

        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j] && lis[i]<lis[j]+1)
                {
                    lis[i]=lis[j]+1;
                    prev[i]=j;
                }
            }
        }

        int maxi=0;
        for(int i=0;i<n;i++)
            if(lis[i]>lis[maxi])
                maxi=i;
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(maxi!=-1)
        {
            ans.add(arr[maxi]);
            maxi=prev[maxi];
        }

        Collections.reverse(ans);
        System.out.println("Longest Increasing Seq : "+ans);
        return lis;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 9, 7, 6, 10, 3, 1};
        int lis[] = lis(arr);
        int lds[] = lds(arr);

        int maxi=0;
        for(int i=0;i<lds.length;i++)
        {
            int x=(lds[i]+lis[i]-1);
            if(x>maxi)
                maxi=x;
        }

        System.out.println("The longest bitonic seq : "+maxi);
    }
}
