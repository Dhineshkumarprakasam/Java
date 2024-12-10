import java.util.Scanner;

public class maneuvering
{
    static int find(int m,int n)
    {
        if(m==1||n==1)
            return 1;
        return find(m-1,n)+find(m,n-1); //diagonal + find(m-1,n-1)
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m : ");
        int m = sc.nextInt();

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println("No of paths : "+find(m,n));
    }
}
