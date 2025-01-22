public class Maximum_Subarray {
    public static void main(String args[])
    {
        int arr[]={1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;

        int result[]=new int [arr.length-k+1];
        int index=0;

        for(int i=0;i<=arr.length-k;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++)
                if(arr[j]>max)
                    max=arr[j];
            
            result[index]=max;
            index++;
        }

        for(int i : result)
            System.out.print(i+" ");
    }
}
