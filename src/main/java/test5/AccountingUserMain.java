package test5;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountingUserMain {
    public static void main(String[] args) throws FileNotFoundException {
        AccountingUser user=new AccountingUser();
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String name=scan.nextLine();
            user.testUser(name);
        }
        user.printFile();
        user.close();
    }
}
