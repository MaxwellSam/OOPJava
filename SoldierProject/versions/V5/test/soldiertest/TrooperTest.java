package test.soldiertest;
 
import soldierpackage.Trooper;

public class TrooperTest {
    private static Trooper trooper = new Trooper(10);

    public static void main(String[] args) {
        System.out.println("# Test Trooper #");
        testTrooperLife();
        testHit();
        testWard_off();
    }
    
    static void testTrooperLife(){
        int lifeTrooper = trooper.getLife();
        if (lifeTrooper == 10){
            System.out.println("life trooper = "+lifeTrooper+" --> creation tooper ok.");
        } else {
            System.out.println("Error : life trooper = "+lifeTrooper+" ≠ 10 --> creation tooper does not work.");
        }
    }

    static void testHit(){
        int force = trooper.hit();
        if(force == 10){
            System.out.println("trooper hit at "+force+" --> trooper hit well");
        } else {
            System.out.println("Error : trooper hit at "+force+ " ≠ 10 --> trooper hit method does not work.");
        }
    }

    static void testWard_off(){
        int lifeBefore = trooper.getLife();
        int forceToWardOff = 5;
        boolean isAlive = trooper.ward_off(forceToWardOff);
        int lifeAfter = trooper.getLife();
        if (isAlive){
            if (lifeAfter == lifeBefore - forceToWardOff){
                System.out.println("trooper's life has decreased by "+forceToWardOff+" points (life before "+lifeBefore+" / life after "+lifeAfter+") --> trooper wards off well.");
            } else {
                System.out.println("Error : life before = "+lifeBefore+" ; force hit = "+forceToWardOff+" ; life after = "+lifeAfter+" --> trooper ward off method does not work.");
            }
        } else {System.out.println("trooper dead");}
    }
}
