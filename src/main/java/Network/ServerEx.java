package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(8090);
        try {
            System.out.println("Waiting for Client #1....");
            Socket socket1 = listener.accept();
            System.out.println("Client #1 connected!"+socket1.getInetAddress());

            System.out.println("Waiting for Client #2....");
            Socket socket2 = listener.accept();
            System.out.println("Client #2 connected!"+socket2.getInetAddress());


            DataInputStream inputStream1 = new DataInputStream(
                    socket1.getInputStream());
            DataOutputStream outputStream1 = new DataOutputStream(
                    socket1.getOutputStream());

            DataInputStream inputStream2 = new DataInputStream(
                    socket2.getInputStream());
            DataOutputStream outputStream2 = new DataOutputStream(
                    socket2.getOutputStream());

            while (true) {
                String textFromClient = inputStream1.readUTF();
                System.out.println("Client #1: " + textFromClient);
                outputStream2.writeUTF("(" + textFromClient + ")");
                outputStream2.flush();

                textFromClient = inputStream2.readUTF();
                System.out.println("Client #2: " + textFromClient);
                outputStream1.writeUTF("(" + textFromClient + ")");
                outputStream1.flush();
            }
        } catch (Exception e) {        }
    }
}
