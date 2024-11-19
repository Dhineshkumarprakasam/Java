import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class server
{
    public static void main(String args[])
    {
        try
        {
            DatagramSocket datagramSocket = new DatagramSocket();
            byte buffer[] = new byte[1024];
            String data = "hello world";
            InetAddress ip = InetAddress.getByName("localhost");

            DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(),data.length(),ip,9000);

            datagramSocket.send(datagramPacket);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
