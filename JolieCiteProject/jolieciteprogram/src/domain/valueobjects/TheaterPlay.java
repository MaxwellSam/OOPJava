package domain.valueobjects;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class TheaterPlay implements ShowInterface {
    
    // Class variables
    String name;
    ArrayList<Calendar> dates = new ArrayList<Calendar>();

    // Class constructor
    public TheaterPlay(String name, int[][] dates){
        this.name = name;
        for (int[] d : dates){
            this.dates.add(new GregorianCalendar(d[0], d[1], d[2], d[3], 00));
        }  
    }
    public TheaterPlay(String name, ArrayList<Calendar> dates){
        this.name = name;
        this.dates = dates;
    }

    // Class methods
    
    // Override methods
    @Override
    public boolean checkDate(Calendar date) {
        return !this.dates.contains(date); 
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType(){
        return "TheaterPlay";
    }

    @Override
    public ArrayList<Calendar> getDate() {
        return this.dates;
    }

    @Override
    public ArrayList<String> getDateFormatted() {
        ArrayList<String> datesformatted = new ArrayList<>();
        for (Calendar d : this.dates){
            datesformatted.add(sdf.format(d.getTime()));
        }
        return datesformatted;
    }
}


