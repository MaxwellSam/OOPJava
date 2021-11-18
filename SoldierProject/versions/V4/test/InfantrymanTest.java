package test;
 
import soldierpackage.Infantryman;

public class InfantrymanTest {
    private static Infantryman infantryman = new Infantryman(10);

    public static void main(String[] args) {
        System.out.println("# Test Infantryman #");
        testInfantrymanLife();
        testHit();
        testWard_off();
    }
    
    static void testInfantrymanLife(){
        int lifeInfantry = infantryman.getLife();
        if (lifeInfantry == 10){
            System.out.println("life infantryman = "+lifeInfantry+" --> creation infantryman ok.");
        } else {
            System.out.println("Error : life infantryman = "+lifeInfantry+" ≠ 10 --> creation tooper does not work.");
        }
    }

    static void testHit(){
        int force = infantryman.hit();
        if(force == 10){
            System.out.println("infantryman hit at "+force+" --> infantryman hit well");
        } else {
            System.out.println("Error : infantryman hit at "+force+ " ≠ 10 --> infantryman hit method does not work.");
        }
    }

    static void testWard_off(){
        int lifeBefore = infantryman.getLife();
        int forceToWardOff = 5;
        boolean isAlive = infantryman.ward_off(forceToWardOff);
        int lifeAfter = infantryman.getLife();
        if (isAlive){
            if (lifeAfter == lifeBefore - forceToWardOff){
                System.out.println("infantryman's life has decreased by "+forceToWardOff+" points (life before "+lifeBefore+" / life after "+lifeAfter+") --> infantryman wards off well.");
            } else {
                System.out.println("Error : life before = "+lifeBefore+" ; force hit = "+forceToWardOff+" ; life after = "+lifeAfter+" --> infantryman ward off method does not work.");
            }
        } else {System.out.println("infantryman dead");}
    }
}

