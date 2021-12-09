package domain.valueobjects;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Concert implements ShowInterface {

    // Class Variables
    Calendar date;
    String name;

    // Class Constructor
    public Concert(String name, int[] date){
        this.name = name;
        this.date = new GregorianCalendar(date[0], date[1], date[2], date[3], date[4]);
    }

    // Class Methods
    public String getStrDateFormatted() {
        Calendar date_ = this.date;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm");
        return sdf.format(date_.getTime());
    }

    // Override Methods
    @Override
    public boolean checkDate(Calendar date2) {
        return this.date.compareTo(date2) != 0; 
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ArrayList<Calendar> getDate() {
        ArrayList<Calendar> arr = new ArrayList<Calendar>();
        arr.add(this.date);
        return arr;
    }
 }