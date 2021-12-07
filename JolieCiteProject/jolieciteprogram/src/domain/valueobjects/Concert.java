package domain.valueobjects;

import java.sql.Date;

public class Concert implements ShowInterface{
     Date date;
     String name;

     public Concert(){

     }

    @Override
    public boolean checkDate(Date date) {
        return this.date.compareTo(date) == 0; 
    }

    @Override
    public String getName() {
        return this.name;
    }
 }