package domain.entities;

import java.util.Calendar;
import domain.agregate.Room;
import domain.valueobjects.ShowInterface;

public class Event {
    int capacity;
    Room room;
    Calendar date;
    ShowInterface show;

    public Event(){

    }
}


