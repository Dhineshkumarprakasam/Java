import java.util.*;
import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) {
        
        try
        {
            Scanner sc = new Scanner(System.in);
            Socket socket = new Socket("localhost",8000);

            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            System.out.print("Enter data : ");
            String data = sc.nextLine();

            output.writeUTF(data);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        
    }
}
