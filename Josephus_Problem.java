import java.util.*;
public class josephus
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        System.out.print("Enter k : ");
        int k = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++)
            arr.add(i+1);
        
        int iter = n-1;
        int temp = k-1;

        while(iter>0)
        {
            arr.remove(temp);
            temp+=k-1;

            if(temp>arr.size()-1)
                temp%=arr.size();
            iter--;
        }

        System.out.println("Ans : "+arr.get(0));
    }
}
