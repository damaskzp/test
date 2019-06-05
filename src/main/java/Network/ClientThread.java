package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClientThread extends Thread {
    private Socket socket;
    private List<ClientThread> allClients;
    private DataInputStream is;
    private DataOutputStream os;
    private String nickName;

    @Override
    public void run() {
        System.out.println("Run thread for client " + socket.getInetAddress());

        try {
            nickName = is.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                String text = is.readUTF();
                Iterator<ClientThread> iterator = allClients.iterator();
                while (iterator.hasNext()) {
                    ClientThread client = iterator.next();
                    if (client.socket.isClosed()) {
                        iterator.remove();
                    }
                }
                for (ClientThread client : allClients) {
                    if (client != this) {
                        client.os.writeUTF(new Date() +
                                " " + nickName + ": :" + text);
                        client.os.flush();
                    }
                }
            } catch (Exception e) {
                try {
                    System.out.println(nickName + " is out");
                    socket.close();
                    allClients.remove(socket);
                    for (ClientThread allClient : allClients) {
                        allClient.os.writeUTF(nickName + " is out");
                        allClient.os.flush();

                    }
                    break;
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public ClientThread(Socket socket, List<ClientThread> allClients) throws IOException {
        this.socket = socket;
        this.allClients = allClients;
        try {
            is = new DataInputStream(socket.getInputStream());
            os = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        start();
    }
}

