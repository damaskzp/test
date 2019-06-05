package test1;

public enum MyDayOfWeek {

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public MyDayOfWeek nextDay() {

        int ordinal = this.ordinal();
        MyDayOfWeek[] values = MyDayOfWeek.values();
        int length = values.length;

        return values[(ordinal + 1) % length];
    }

    @Override
    public String toString() {
        return name();
    }
}


