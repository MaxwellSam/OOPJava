package test;

import domain.entities.*;
import domain.valueobjects.*;

public class EventTest {
    public static void main(String[] args) {
        // test on Envent entity
        int[] date = new int[]{ 2021,12,2,23,00 };
        ShowInterface show = new Concert("Black Eyes Peas",date);
        Event event = new Event(300,show);
        
        // test on attributes
        System.out.println("#### EVENT TESTS #####");
        System.out.println("Event capacity: " + event.getCapacity());
        System.out.println("Event show name: " + event.getShow().getName());
        System.out.println("Event show date: " + event.getShow().getDate());
        // test on capacity

    }
    
}
