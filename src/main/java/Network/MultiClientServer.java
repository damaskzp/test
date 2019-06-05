package Network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MultiClientServer {
    public static void main(String[] args) throws IOException {
        List<ClientThread> allClients = new CopyOnWriteArrayList<>();
        ServerSocket serverSocket = new ServerSocket(8090);
        while (true) {
            System.out.println("Wait client");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            ClientThread clientThread = new ClientThread(socket,allClients);
            allClients.add(clientThread);
        }
    }
}
