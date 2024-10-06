import java.util.*;

public class maxones
{
    static int findmax(int[] a,int k)
    {
        int maxone = Integer.MIN_VALUE;
        int ws=0;
        int nr =0;

        for(int we=0;we<a.length;we++)
        {
            if(a[we]==0)
                nr++;
            while(nr>k)
            {
                if(a[ws]==0)
                    nr--;
                ws++;
            }
            maxone = Math.max(maxone,we-ws+1);
        }

        return maxone;
    }

    public static void main(String args[])
    {
        int a[] = new int[]{1,1,1,1,0,0,0,1,1,1,1,1,0};
        int k=1;

        int result = findmax(a, k);
        System.out.println(result);
    }
}
