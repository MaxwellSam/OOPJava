package domain;
import java.util.Scanner;
import java.util.ArrayList;
import domain.entities.*;

public class Ui {

    public static String displayNoPlacedEvent(ArrayList<Event> eventList) {
        String txt = "";
        for(Event event : eventList){
            txt += event.getInfosAsString();
        }
        return txt;
    }

    public static void main(String[] args) {
        // Load DataBases
        DataBaseEvents events = new DataBaseEvents();
        DataBaseRooms rooms = new DataBaseRooms();
        ManagerRooms manager = new ManagerRooms();
        manager.addRooms(rooms.getRooms());
        ArrayList<Event> noPlacedEvent = manager.placeListEvents(events.getEvents());

        Scanner inputObject = new Scanner(System.in);
		int mainOption;
		do {
			System.out.println("\n\nProgram Manager\n\n");
			System.out.println("Select the Method to Execute:");
			System.out.println("0 = Quit");
			System.out.println("1 = Display concert halls");
            System.out.println("2 = Display events");
            System.out.println("3 = Display Joliecite's program");
            System.out.println("4 = Display not placed events");
			System.out.print("\nOption: ");
			try{
				mainOption = Integer.parseInt(inputObject.nextLine());
			} catch (Exception e){
				mainOption = -1;
			}
			switch (mainOption){
				case 0: System.out.println("\nLater!"); break;
				case 1: rooms.displayDataBase();; break;	
                case 2:	events.displayDataBase();; break;
                case 3: System.out.println(manager.getInfosAsString());; break;
                case 4: System.out.println("No Placed Events \n" + displayNoPlacedEvent(noPlacedEvent));; break;
				default: System.out.println("Invalid Option"); break;
			}
		} while (mainOption!=0);
		
		inputObject.close();
    }
}
