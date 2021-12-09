package test;
import java.lang.reflect.Array;
import java.util.ArrayList;

import domain.valueobjects.*;

public class InterfaceShowTest {
    public static void main(String[] args) {
        int[] date = new int[]{2021, 12, 25, 12, 33};
        ShowInterface SHOW1 = new Concert("ZZTOP", date);
        int[] date1 = new int[]{2021, 12, 26, 12, 33};
        int[] date2 = new int[]{2021, 12, 27, 12, 33};
        int[] date3 = new int[]{2021, 12, 28, 12, 33};
        int[][] dates = new int[][]{date1, date2, date3};
        ShowInterface SHOW2 = new TheaterPlay("BlackSwann", dates);
        // test 1: Name and Dates
        System.out.println("test");
        System.out.printf("Name:%s\tDates:%s\tType:%s\n", SHOW1.getName(), SHOW1.getDateFormatted().toString(), SHOW1.getType()); 
        System.out.printf("Name:%s\tDates:%s\tType:%s\n", SHOW2.getName(), SHOW2.getDateFormatted().toString(), SHOW2.getType()); 
    }
    
}
