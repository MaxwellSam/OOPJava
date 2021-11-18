package test.weapontest;

import weaponspackage.Shield;

public class ShieldTest {
    private static Shield shield = new Shield(10);
    public static void main(String[] args) {

        System.out.println("\n# Test Shield #");
        testForce();
        testCapacity();
        testDeterioration();
    }

    static void testForce(){
        int force = shield.force();
        if (force != 0){
            System.out.println("Error : force shield different to 0.");
        } else {
            System.out.println("--> force shield ok");
        }
    }

    static void testCapacity(){
        int capacity = shield.capacity();
        if (capacity != 15){
            System.out.println("Error : capacity shield different to 15.");
        } else {
            System.out.println("--> capacity shield ok");
        }
    }
    
    static void testDeterioration(){
        int restForce = shield.deterioration(5);
        if (restForce != 0){
            System.out.println("Error : deterioration of shield does not work.");
        } else {
            System.out.println("fist deterioration with 5 ok, restforce = "+restForce);
            restForce = shield.deterioration(10);
                if (restForce != 5+2){
                    System.out.println("Error : deterioration of shield does not work, rest force = "+restForce);
                } else {
                    System.out.println("Second deterioration with 10 ok, restforce 5 + 2 = "+restForce);
            }
        }
    }
}

