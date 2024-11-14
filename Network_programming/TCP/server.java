import java.io.*;
import java.util.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        
        try
        {
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server is listening....");

            Socket socket = serverSocket.accept();
            System.out.println("Connected to client..");

            DataInputStream input = new DataInputStream(socket.getInputStream());
            

            System.out.println("Received : "+input.readUTF());
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        




    }
}
