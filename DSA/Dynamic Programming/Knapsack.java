public class Knapsack {
    public static void main(String[] args) {
        
        int weights[]={10,40,20,30};
        int values[]={60,40,100,120};
        int m=50;
        
        int n = weights.length;

        int dp[][] = new int[n+1][m+1];

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(weights[i-1]<=j)
                {
                    dp[i][j]=Math.max(dp[i-1][j],values[i-1]+dp[i-1][j-weights[i-1]]);
                }
                else
                    dp[i][j]=dp[i-1][j];
            }

        }

        System.out.println(dp[n][m]);
    }
}
