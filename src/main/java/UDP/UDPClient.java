package UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAdress = InetAddress.getByName("localhost");
        String sentence = in.readLine();
        byte[] sendData = sentence.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(
                sendData, sendData.length, IPAdress, 8888);
        clientSocket.send(sendPacket);
    }
}
