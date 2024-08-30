import java.util.*;

public class seg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start : ");
        int start = input.nextInt();

        System.out.print("Enter end  :");
        int n = input.nextInt();

        int size = (int)Math.sqrt(n);

        boolean prim[]=new boolean[size+1];

        for(int i=0;i<size;i++)
            prim[i]=true;
        
        for(int i=2;i<size;i++)
        {
            if(prim[i]==true)
                for(int j=(i*i);j<size;j+=i)
                    prim[j]=false;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<size;i++)
            if(prim[i]==true)
                arr.add(i);
        

        boolean segsive[]=new boolean[n-start+1];
        Arrays.fill(segsive,true);

        for (int p=2;p<arr.size();p++) 
        {
            for(int j=start;j<=n;j++)
            {
                if(j%arr.get(p)==0)
                    segsive[j-start]=false;
            }
            
        }

        for(int i=0;i<(n-start+1);i++)
        {
            if(segsive[i]==true)
            {
                System.out.println(i+start);
            }
        }
    }
}
