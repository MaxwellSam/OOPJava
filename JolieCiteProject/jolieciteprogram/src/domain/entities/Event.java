package domain.entities;
import java.util.ArrayList;
import java.util.Calendar;

import domain.valueobjects.ShowInterface;

public class Event {
    int capacity;
    ShowInterface show;

    public Event(int capacity, ShowInterface show){
        this.capacity = capacity;
        this.show = show;
    }

    public int getCapacity(){
        return capacity;
    }

    public ShowInterface getShow(){
        return show;
    }

    public ArrayList<Calendar> getDates(){
        return this.show.getDate();
    }

    public String getInfosAsString(){
        String txt = "";
        txt+="# Event: "+this.show.getName()+"\tType: "+this.show.getType()+"\n";
        for (String date : show.getDateFormatted()){
            txt+="- "+date+"\n";
        }
        return txt;
    }
}


