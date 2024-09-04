import java.util.*;
import java.net.*;

public class t1 {

    public static void main(String[] args) {
        try
        {
            InetAddress in = InetAddress.getLocalHost();
            System.out.println("Name : "+in.getHostName());
            System.out.println("IP   : "+in.getHostAddress());
        }
        catch(Exception hello)
        {
            System.out.println(hello);
        }
    }
}
