public class SumOfSubsetEqualsTarget{
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4};
        int target=6;
        int n = arr.length;

        boolean dp[][]=new boolean[n+1][target+1];

        for(int i=0;i<=n;i++)
            dp[i][0]=true;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=target;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
                else
                    dp[i][j]=dp[i-1][j];
            }
        }

        System.out.println(dp[n][target]);
    }
}
