import java.util.Scanner;

class Sive
{
    public static void main(String args[])
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N :");
        int n=input.nextInt();

        boolean arr[] = new boolean[n];

        for(int i=0;i<n;i++)
            arr[i]=true;

        for(int i=2;i*i<n;i++)
        {
            if(arr[i]==true)
                for(int j=(i*i);j<n;j+=i)
                    arr[j]=false;
        }

        for(int i=2;i<n;i++)
            if(arr[i]==true)
                System.out.println(i+" ");
    }

}
