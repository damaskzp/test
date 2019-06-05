package test1;

public class MainMyDayOfWeek {
    public static void main(String[] args) {

        for (MyDayOfWeek days : MyDayOfWeek.values()) {
            //System.out.println(days);
        }

        System.out.println(MyDayOfWeek.MONDAY
                .nextDay()
                .nextDay());

    }
}
