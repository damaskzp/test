package test1;

import java.util.Deque;
import java.util.LinkedList;

public class MainApril {
    public static void main(String[] args) {
        String s = "(2-3)+[333]+{4*(2-5)}";
        Deque<Character> deque = new LinkedList<Character>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                deque.addLast(c);
            } else if (c == '}' || c == ')' || c == ']') {
            }

        }
    }
}
