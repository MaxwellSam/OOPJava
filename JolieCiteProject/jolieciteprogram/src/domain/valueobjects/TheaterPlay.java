package domain.valueobjects;

import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class TheaterPlay implements ShowInterface {
    
    // Class variables
    String name;
    ArrayList<Calendar> dates = new ArrayList<Calendar>();

    // Class constructor
    public TheaterPlay(String name, ArrayList<Calendar> dates){
        this.name = name;
        this.dates = dates;    
    }

    // Class methods
    public void getDateFormatted() {
        // Calendar date_ = this.date;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm");
        String datesformatted = "";

        


        // for (int i = 0; i<this.dates.size(); i++) {
        //     System.out.println(i);
        //     if (i == this.dates.size()){
        //         dateformatted += sdf.format(this.dates.get(i).getTime());
        //         System.out.println(dateformatted);
        //     }
        //     else {
        //         dateformatted += sdf.format(this.dates.get(i).getTime());
        //         System.out.println(i);
        //     }
        // };
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm");
        // return sdf.format(date_.getTime());
    }

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
    public ArrayList<Calendar> getDate() {
        return this.dates;
    }
}


