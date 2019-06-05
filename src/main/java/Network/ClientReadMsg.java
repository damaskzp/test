package Network;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientReadMsg extends Thread {
    private Socket socket;

    public ClientReadMsg(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream inputStream = new DataInputStream(
                    socket.getInputStream());
            while (true) {
                String readText = inputStream.readUTF();
                System.out.println(readText);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
