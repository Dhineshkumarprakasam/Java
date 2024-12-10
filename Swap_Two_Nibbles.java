import java.util.*;

public class t10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num : ");
        int n = sc.nextInt();

        int ans =(n & 0x0F) << 4 | (n & 0xF0) >> 4;
        System.out.println(ans);
    }
}
