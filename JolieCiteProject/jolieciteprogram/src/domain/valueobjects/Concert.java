package domain.valueobjects;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;


public class Concert implements ShowInterface {

    // Class Variables
    Calendar date;
    String name;

    // Class Constructor
    public Concert(String name, int[] date){
        this.name = name;
        this.date = new GregorianCalendar(date[0], date[1], date[2], date[3], 00);
    }
    public Concert(String name, Calendar date){
        this.name = name;
        this.date = date;
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
    public String getType(){
        return "Concert";
    }

    @Override
    public ArrayList<Calendar> getDate() {
        ArrayList<Calendar> arr = new ArrayList<Calendar>();
        arr.add(this.date);
        return arr;
    }

    @Override
    public ArrayList<String> getDateFormatted() {
        ArrayList<String> dateformated = new ArrayList<String>();
        dateformated.add(sdf.format(this.date.getTime()));
        return dateformated;
    }
 }