package domain;

public class ui {

    public int menu() {
        return 0;
    }
    public static void main(String[] args) {
        DataBaseRooms rooms = new DataBaseRooms();

        ManagerRooms manager = new ManagerRooms();
        
        System.out.println("##########TEST MANAGER");
        manager.addRooms(rooms.getRooms());
        manager.displayRooms();
    }
}
