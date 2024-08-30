public class remainder {

    static int find(int num[],int rem[],int n)
    {
        int x=1;
        while(true)
        {
            for(int i=0;i<n;i++)
            {
                if(x%num[i]!=rem[i])
                    break;
                if(i==n-1)
                    return x;
            }
            x++;  
        }
    }

    public static void main(String[] args) {
        int num[]={3,4,5};
        int rem[]={2,3,1};
        System.out.println(find(num,rem,num.length));   
    }
}
