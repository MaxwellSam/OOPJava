package domain.valueobjects;

import java.util.Calendar;

public class Concert implements ShowInterface{
     Calendar date;
     String name;

     public Concert(String name, int ){
        this.date = new Calendar()
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