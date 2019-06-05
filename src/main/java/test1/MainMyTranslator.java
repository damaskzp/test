package test1;

import java.util.Scanner;

public class MainMyTranslator {
    public static void main(String[] args) {
        MyTranslator myTranslator = new MyTranslator();
        initDict(myTranslator);
        String s = readFromKeyword();
        myTranslator.translate("cat");
        readFromKeyword();
        System.out.println(myTranslator.translateSentence(s));
    }

    private static String readFromKeyword() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void initDict(MyTranslator myTranslator) {
        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("new", "новый");
        myTranslator.addNewWord("day", "день");
    }
}
