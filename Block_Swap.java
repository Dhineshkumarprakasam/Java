public class block_swap {
    public static void reverse_arr(int arr[],int start, int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {7,8,9,10};
        int d = 5;
        int n = arr.length;

        d%=n;

        reverse_arr(arr, 0, d-1);
        reverse_arr(arr, d, n-1);
        reverse_arr(arr, 0, n-1);

        for(int i : arr)
            System.out.print(i+" ");
    }
}
