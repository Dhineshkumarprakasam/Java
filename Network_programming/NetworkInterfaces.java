import java.util.*;
import java.net.*;
public class t2 {

    public static void main(String[] args) {
        
        try
        {
            InetAddress in = InetAddress.getLocalHost();
            NetworkInterface ni = (NetworkInterface) NetworkInterface.getByInetAddress(in);

            Enumeration<InetAddress> enum1 = ni.getInetAddresses();
            System.out.println("Adapter name : "+ni.getName());
            System.out.println("Adapter IP : "+ni.getDisplayName());
            while(enum1.hasMoreElements())
            {
                InetAddress ii = enum1.nextElement();
                System.out.println("Name : "+ii.getHostName());
                System.out.println("IP   : "+ii.getHostAddress());
                System.out.println();
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    
}
