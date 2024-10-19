import java.util.*;
public class p10 {
    
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        
        ArrayList<Integer> a = new ArrayList<>();

        int n=6;
        int max = arr[n-1];
        a.add(max);
        for(int i=n-2;i>0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                a.add(max);
            }
        }

        for(int i=a.size()-1;i>=0;i--)
        {
            System.out.print(a.get(i)+" ");
        }
    }
}
