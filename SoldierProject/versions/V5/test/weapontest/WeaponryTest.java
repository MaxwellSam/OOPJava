package test.weapontest;

import weaponspackage.*;

public class WeaponryTest {
    private static Weaponry weaponry = new Weaponry();
    public static void main(String[] args) {
        System.out.println("\n# Test Weaponry");
        System.out.println("1) without weapons");
        testHitdefault();
        testWardOffDefault();
        System.out.println("2) with weapons");
        Sword sw = new Sword(10);
        Shield sh = new Shield(10);
        weaponry.addWeapon(sw);
        weaponry.addWeapon(sh);
        testHit(); 
        testWardOff();
    }

    static void testHitdefault(){
        int x = weaponry.hit();
        if (x!=0){
            System.out.println("Error : hit method does not work.");
        } else {
            System.out.println("hit method with default values work.");
        }
    }

    static void testWardOffDefault(){
        int x = weaponry.ward_off(10);
        if (x!=10){
            System.out.println("Error : ward_off method does not work.");
        } else {
            System.out.println("ward_off method with default values work.");
        }
    }

    static void testHit(){
        int x = weaponry.hit();
        if (x==0){
            System.out.println("Error : hit method does not work.");
        } else {
            System.out.println("hit method work, hit at "+x);
        }
        for (int i = 0 ; i < 15 ; i++){
            x = weaponry.hit();
        }
    }

    static void testWardOff(){
        int x = weaponry.ward_off(20);
        if (x!=0){
            System.out.println("Error : ward_off method does not work.");
        } else {
            System.out.println("ward_off method work.");
        }
        System.out.print(x+" >>");
        for (int i = 0 ; i < 15 ; i++){
            x = weaponry.ward_off(1);
            System.out.print(x+" >>");
        }
    }
}
