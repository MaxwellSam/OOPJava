package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalandarTest {
    public static void main(String[] args) {
        // test Date object 
        Calendar date = new GregorianCalendar(2020, 11, 23, 13, 00, 00);
        //String time = new SimpleDateFormat("HH:mm:ss").format(date);
        System.out.println(date); 
    }
}
