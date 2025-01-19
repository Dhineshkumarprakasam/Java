import java.util.*;

public class t3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter no of people : ");
        n = sc.nextInt();

        int arr[][] = new int[n][n];

        //getting input
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter for "+i+","+j+" : ");
                arr[i][j]=sc.nextInt();
            }  
        }

        int found=0;

        //finding
        for(int i=0;i<n;i++)
        {
            int row=0;
            int column=0;
            int person;

            for(int j=0;j<n;j++)
                if(i!=j)
                {
                    person=i;
                    row+=arr[i][j];
                    column+=arr[j][i];
                }
            
            if(row==0 && column==(n-1))
            {
                System.out.println("The person is : "+i);
                found=1;
                break;
            }
        }

        if(found==0)
            System.out.println("No Celebrity found");
    }
}
