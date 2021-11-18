package test.weapontest;

import weaponspackage.Sword;

//import waeponspackage.Sword;

public class SwordTest {
    private static Sword sword = new Sword(10);
    public static void main(String[] args) {
        System.out.println("\n# Test Sword #");
        testForce();
        testCapacity();
        testDeterioration();
    }

    static void testForce(){
        int force = sword.force();
        if (force != 20){
            System.out.println("Error : force sword different to 20.");
        } else {
            System.out.println("--> force sword ok");
        }
    }

    static void testCapacity(){
        int capacity = sword.capacity();
        if (capacity != 0){
            System.out.println("Error : capacity sword different to 0.");
        } else {
            System.out.println("--> capacity sword ok");
        }
    }

    static void testDeterioration(){
        int restForce = sword.deterioration(0);
        if (restForce != 0) {
            System.out.println("Error : deterioration of sword does not work.");
        } else {
            System.out.print(restForce+" >> ");
            for (int i = 0 ; i < 10; i++){
                restForce = sword.deterioration(0);
                System.out.print(restForce+" >> ");
            }
            if (restForce != 1){
                System.out.println("Error : deterioration of sword does not work.");
            } else {
                System.out.println("deterioration of sword works well.");
            }
        }
    }
}
