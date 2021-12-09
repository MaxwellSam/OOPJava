package domain;
import java.util.ArrayList;

import domain.entities.Event;
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

        int[] date1 = new int[]{ 2021,12,10,20,00 };
        ShowInterface show1 = new Concert("White Eyes Peas",date1);
        Event event1 = new Event(300,show1);
        // Expected: Room2

        int[] date2 = new int[]{ 2022,01,12,20,00 };
        ShowInterface show2 = new Concert("Me2",date2);
        Event event2 = new Event(200,show2);
        // Expected: Room2

        int[] date3 = new int[]{ 2021,12,31,20,00 };
        ShowInterface show3 = new Concert("Red Floyd",date3);
        Event event3 = new Event(100,show3);
        // Expected: Room3

        int[] date4 = new int[]{ 2021,12,21,20,00 };
        ShowInterface show4 = new Concert("The Standing Stone",date4);
        Event event4 = new Event(500,show4);
        // Expected: No Room -> Room1 no places

        int[] date5 = new int[]{ 2021,12,10,20,00 };
        ShowInterface show5 = new Concert("Mauve Desir",date5);
        Event event5 = new Event(20,show5);
        // Expected: Room3

        int[] date6 = new int[]{ 2021,12,15,23,00 };
        ShowInterface show6 = new Concert("BC/BG",date6);
        Event event6 = new Event(300,show6);
        // Expected: Room2

        int[] date7 = new int[]{ 2021,12,14,29,00 };
        ShowInterface show7 = new Concert("The Thierry Eight",date7);
        Event event7 = new Event(10,show7);
        // Expected: Room3 but no places, given Room2 but too big, need patching

        int[] date8 = new int[]{ 2021,12,14,23,00 };
        ShowInterface show8 = new Concert("Malas Vista Bank Club",date8);
        Event event8 = new Event(5,show8);
        // Expected: Room3

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
