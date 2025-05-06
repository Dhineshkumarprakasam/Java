import java.util.*;
public class lis {
    public static void main(String[] args) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        int lis[] = new int[n];
        int prev[]=new int[n];

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
        System.out.println(ans);
    }
}
