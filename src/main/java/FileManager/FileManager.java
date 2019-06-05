package FileManager;

import java.io.File;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                System.out.println("Bye!");
                System.exit(0);
            }
            try {
                String[] split = command.split(" ");
                command = split[0];
                String parametrs = split[1];
                switch (command) {
                    case "mkdir":
                        File file = new File(parametrs);
                        if (file.mkdir()) {
                            System.out.println("Создан каталог " + file);
                        } else {
                            System.out.println("Каталог не создан " + file);
                        }
                        file.mkdir();
                    case "mkfile":
                        File file1 = new File(parametrs);
                        if (file1.createNewFile()) {
                            System.out.println("Создан файл " + file1);
                        } else {
                            System.out.println("Файл не создан " + file1);
                        }
                        file1.createNewFile();
                        break;
                    default:
                        System.out.println("Неизвестная команда");
                }
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }
}
