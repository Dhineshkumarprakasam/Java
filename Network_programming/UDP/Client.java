import java.util.*;
import java.io.*;
import java.net.*;

public class c2 {

    public static void main(String[] args) {
        
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ip or domain name : ");
            String val = sc.nextLine();
            InetAddress ip = InetAddress.getByName("localhost");

            DatagramSocket datagramSocket = new DatagramSocket();
            DatagramPacket datagramPacket = new DatagramPacket(val.getBytes(),val.length(),ip,9000);
            datagramSocket.send(datagramPacket);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
