package domain.entities;
import java.util.ArrayList;
import domain.valueobjects.*;

public class DataBaseEvents {
    ArrayList<Event> events;
    
    public DataBaseEvents() {
        this.events = loadDB();
    }

    public void displayDataBase(){
        for(Event event: this.events){
            System.out.println("Event capacity: " + event.getCapacity());
            System.out.println("Event show name: " + event.getShow().getName());
            System.out.println("Event show date: " + event.getShow().getDateFormatted());
        }
    }

    public  ArrayList<Event> loadDB(){
        ArrayList<Event> events = new ArrayList<Event>();

        int[] date1 = new int[]{ 2021,12,2,23,00 };
        ShowInterface show1 = new Concert("Black Eyes Peas",date1);
        Event event1 = new Event(300,show1);

        int[] date2 = new int[]{ 2021,12,2,23,00 };
        ShowInterface show2 = new Concert("Black Eyes Peas",date2);
        Event event2 = new Event(300,show2);

        int[] date3 = new int[]{ 2021,12,2,23,00 };
        ShowInterface show3 = new Concert("Black Eyes Peas",date3);
        Event event3 = new Event(300,show3);

        int[] date4 = new int[]{ 2021,12,2,23,00 };
        ShowInterface show4 = new Concert("Black Eyes Peas",date4);
        Event event4 = new Event(300,show4);

        int[] date5 = new int[]{ 2021,12,2,23,00 };
        ShowInterface show5 = new Concert("Black Eyes Peas",date5);
        Event event5 = new Event(300,show5);

        int[] date6 = new int[]{ 2021,12,2,23,00 };
        ShowInterface show6 = new Concert("Black Eyes Peas",date6);
        Event event6 = new Event(300,show6);

        int[] date7 = new int[]{ 2021,12,2,23,00 };
        ShowInterface show7 = new Concert("Black Eyes Peas",date7);
        Event event7 = new Event(300,show7);

        int[] date8 = new int[]{ 2021,12,2,23,00 };
        ShowInterface show8 = new Concert("Black Eyes Peas",date8);
        Event event8 = new Event(300,show8);

        events.add(event1);
        events.add(event2);
        events.add(event3);
        events.add(event4);
        events.add(event5);
        events.add(event6);
        events.add(event7);
        events.add(event8);
        return events;
    }
}
