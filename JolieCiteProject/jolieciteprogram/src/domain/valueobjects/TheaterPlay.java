package domain.valueobjects;

import java.util.ArrayList;
import java.util.Calendar;

public class TheaterPlay implements ShowInterface {
    String name;
    ArrayList<Calendar> dates = new ArrayList<Calendar>();

    public TheaterPlay(String name, ArrayList<Calendar> dates){
        this.name = name;
        this.dates = dates;    
    }

    @Override
    public boolean checkDate(Calendar date) {
        return !this.dates.contains(date); 
    }

    @Override
    public String getName() {
        return this.name;
    }
}


