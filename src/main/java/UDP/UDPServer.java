package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket serverSocket=new DatagramSocket(8888);
        byte[]receiveData=new byte[1024];
        while (true){
            DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
            serverSocket.receive(receivePacket);
            String sentence=new String(receivePacket.getData());
            System.out.println("Received: " + sentence);
        }
    }
}