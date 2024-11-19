
import java.net.*;


public class client1 {
    public static void main(String[] args) {
        
        try
        {
            DatagramSocket datagramSocket = new DatagramSocket(9000);
            byte buffer[] = new byte[1024];

            DatagramPacket datagramPacket = new DatagramPacket(buffer,1024);
            datagramSocket.receive(datagramPacket);

            String out = new String(datagramPacket.getData());
            System.out.println(out);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
