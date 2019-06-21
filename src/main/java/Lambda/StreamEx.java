package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            integers.add(rnd.nextInt(100) - 50);
        }
        List<String> positiv = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer >= 0) {
                int i = integer % 10;
                String s = "e" + i;
                if (s.endsWith("1")) {
                    positiv.add(s);
                }
            }
        }

        List<String> collect = integers.stream()
                .filter(t -> t >= 0)
                .map(t -> t % 10)
                .map(t -> "e" + t)
                .filter(t -> t.endsWith("1"))
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(positiv);

        // new Random().ints()
    }
}
