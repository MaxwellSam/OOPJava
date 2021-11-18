package test;

import soldierpackage.*;

public class SoldierWithSwordTest {
    private static SoldierInterface trooper;
    private static SoldierInterface infantryman;

    public static void main(String[] args) {
        System.out.println("# Test Trooper with Sword #");
        trooper = new Trooper(50);
        SoldierWithSword trooperDecorated =  new SoldierWithSword(trooper);
        testLifeSword(trooperDecorated);
        testTrooperHitSword(trooperDecorated);
        testWardOffSword(trooperDecorated);
        testHitDeathDecore(trooperDecorated);

        System.out.println("# Test Infantryman with Shield #");
        infantryman = new Infantryman(50);
        SoldierWithSword infantrymanDecorated = new SoldierWithSword(infantryman);
        testLifeSword(infantrymanDecorated);
        testInfantrymanHitSword(infantrymanDecorated);
        testWardOffSword(infantrymanDecorated);
        testHitDeathDecore(infantrymanDecorated);
    }

    static void testLifeSword(SoldierWithSword soldier){
        int lifeSword = soldier.getLife();
        if (lifeSword == 30){
            System.out.println("life soldier's sword = "+lifeSword+" --> creation Decorator sword ok.");
        } else {
            System.out.println("Error : life soldier's sword = "+lifeSword+" ≠ 30 --> creation Decorator sword does not work.");
        }
    }

    static void testTrooperHitSword(SoldierWithSword soldier){
        int force = soldier.hit();
        if (force == 10 + trooper.hit()){
            System.out.println("trooper with sword hit at "+force+" --> trooper hit well with a sword.");
        } else {
            System.out.println("Error : trooper with sword hit at "+force+ " ≠ 10 + "+trooper.hit()+" --> trooper hit method with sword does not work.");
        }
    }

    static void testInfantrymanHitSword(SoldierWithSword soldier){
        int force = soldier.hit();
        if (force == 10 + infantryman.hit()){
            System.out.println("infantryman with sword hit at "+force+" --> infantryman hit well with a sword.");
        } else {
            System.out.println("Error : infantryman with sword hit at "+force+ " ≠ 10 + "+trooper.hit()+" --> infantryman hit method with sword does not work.");
        }
    }

    static void testWardOffSword(SoldierWithSword soldier){
        int lifeBefore = soldier.getLife();
        int force = 2;
        soldier.ward_off(force);
        int lifeAfter = soldier.getLife();
        System.out.println("life before = "+lifeBefore+" ; force hit = "+force+" ; capacity sword ="+soldier.capacity()+" ; life after = "+lifeAfter);
    }

    static void testHitDeathDecore(SoldierWithSword soldier){
        System.out.print("hit before death of sword = "+soldier.hit());
        while(soldier.getLife()!=0){
            soldier.ward_off(1);
        }
        System.out.println(" ; hit after death of sword = "+soldier.hit());
    }



}
