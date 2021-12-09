package domain.entities;
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
}


