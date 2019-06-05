package test1;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleEx {
    public static void main(String[] args) throws IOException {
        Date date = getCurrentDate();
        System.out.println(date);
        date.setMinutes(0);
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar);
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy dd MMMM hh:mm", new Locale("RU"));
        System.out.println(simpleDateFormat.format(date));

        Process process=
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\FORScan\\FORScan.exe");
    }

    private static Date getCurrentDate() {
        return new Date();
    }
}
