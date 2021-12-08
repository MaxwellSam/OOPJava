package domain.valueobjects;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Concert implements ShowInterface{
     Calendar date;
     String name;

     public Concert(String name, int[] date){
        this.name = name;
        this.date = new GregorianCalendar(date[0], date[1], date[2], date[3], date[4], date[6]);
     }

    @Override
    public boolean checkDate(Calendar date2) {
        return this.date.compareTo(date2) != 0; 
    }

    @Override
    public String getName() {
        return this.name;
    }
 }