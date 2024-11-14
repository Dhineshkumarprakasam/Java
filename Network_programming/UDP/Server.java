import java.util.*;
import java.io.*;
import java.net.*;

public class s2 {

    public static void main(String[] args) {
        
        try
        {
            DatagramSocket datagramSocket = new DatagramSocket(9000);
            byte buffer[] = new byte[1024];

            DatagramPacket datagramPacket = new DatagramPacket(buffer,1024);

            HashMap<String,String> map = new HashMap<>();
            map.put("165.165.80.80","www.aptitudeguru.com");
            map.put("165.165.79.1","www.downloadcyclone.blogspot.com");

            datagramSocket.receive(datagramPacket);
            String value = new String(datagramPacket.getData());

            for(var i: map.entrySet())
            {
                if(value.trim().equals(i.getKey()))
                    System.out.println(i.getValue());

                else if(value.trim().equals(i.getValue()))
                    System.out.println(i.getKey());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
