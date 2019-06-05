package Network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8090);
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(socket.getInputStream()));
//        System.out.println(in.readLine());
        DataOutputStream outputStream = new DataOutputStream(
                socket.getOutputStream());

        DataInputStream inputStream = new DataInputStream(
                socket.getInputStream());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            outputStream.writeUTF(line);
            outputStream.flush();

            String serverAnswer = inputStream.readUTF();
            System.out.println("Answer: " + serverAnswer);
        }
    }
}
