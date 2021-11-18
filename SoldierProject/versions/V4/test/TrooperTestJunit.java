package test;
 
import soldierpackage.Trooper;
import static org.junit.Assert.*;

import org.junit.Test;

public class TrooperTestJunit {
    private static Trooper infantryman = new Trooper(10);

    public static void main(String[] args) {
        System.out.println("# Test Trooper #");
        testTrooperLife();
        testHit();
        testWard_off();
    }
    
    @Test
    static void testTrooperLife(){
        int lifeTrooper = infantryman.getLife();
        assertTrue("life infantryman incorect", lifeTrooper == 10);
        System.out.println("Trooper life = "+lifeTrooper);
    }

    @Test
    static void testHit(){
        int force = infantryman.hit();
        assertTrue("force infantryman incorect",force == 10);
        System.out.println("Force Trooper = "+ force);
    }

    @Test
    static void testWard_off(){
        int lifeBefore = infantryman.getLife();
        int forceToWardOff = 5;
        boolean isAlive = infantryman.ward_off(forceToWardOff);
        int lifeAfter = infantryman.getLife();
        if (isAlive){
            assertTrue("ward off infantryman does not work", lifeAfter == lifeBefore - forceToWardOff);
            System.out.println("life before "+lifeBefore+" ; life after "+lifeAfter);
        } else {System.out.println("infantryman dead");}
    }
}
