package domain.valueobjects;

import java.sql.Date;
import java.util.ArrayList;

public class TheaterPlay implements ShowInterface {
    String name;
    ArrayList<Date> dates = new ArrayList<Date>();

    public TheaterPlay(String name, ArrayList<Date> dates){
        this.name = name;
        this.dates = dates;    
    }

    @Override
    public boolean checkDate(Date date) {
        return !this.dates.contains(date); 
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }
}


