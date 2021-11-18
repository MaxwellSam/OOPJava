package test.armytest;
import soldierpackage.Soldier;
import soldierpackage.SuperSoldierInterface;
import armypackage.ArmyComposite;

public class ArmyTest {
    private static ArmyComposite army = new ArmyComposite() {
        
    };
    public static void main(String[] args) {
        System.out.println("\n# Test ArmyComposite #");
        testHitandAdd();
        testAddSword();
        testAddShield();
    }

    static void testHitandAdd(){
        System.out.println("1) with an empty army :");
        System.out.println("army hit at "+army.hit());
        if (army.hit()==0){
            System.out.println("--> army hit works.");
        } else {
            System.out.println("Error : army hit does not work.");
        }
        System.out.println("2) with an army with 3 soldiers :");
        System.out.println("life army with soldiers = "+army.getLife());
        for (int i = 0; i < 3; i++){
            SuperSoldierInterface s = new Soldier("Trooper", 50);
            army.addElement(s);
        }
        System.out.println("life army with soldiers = "+army.getLife());
        if (army.getLife()==50*3){
            System.out.println("--> army add elements well.");
        } else {
            System.out.println("Error : army addElement does not work.");
        }
        System.out.println("army hit now at "+army.hit());
        if (army.hit()==10*3){
            System.out.println("--> army with soldiers hit well.");
        } else {
            System.out.println("Error : army with soldier does not hit well.");
        }
    }

    static void testAddSword(){
        System.out.println("3) with army with soldier with sword:");
        int forceBefore = army.hit();
        System.out.println("army without sword hit at "+forceBefore);
        army.addSword(30);
        System.out.println("army with sword hit at "+army.hit());
        if (army.hit()==(10+20)*3){
            System.out.println("--> army with soldiers and sword hit well.");
        } else {
            System.out.println("Error : army with soldier and sword does not hit well.");
        }
    }
    
    static void testAddShield(){
        System.out.println("3) army with shield:");
        int cnt = 0;
        for (; army.ward_off(30);){
            cnt ++;
        }
        System.out.println("nbr of hit warded off = "+cnt);
        for (int i = 0; i < 3; i++){
            SuperSoldierInterface s = new Soldier("Trooper", 50);
            army.addElement(s);
        }
        army.addShield(30);
        int cnt2 = 0;
        for (; army.ward_off(30);){
            cnt2 ++;
        }
        System.out.println("nbr of hit warded off with shield = "+cnt2);
        if (cnt < cnt2){
            System.out.println("--> army with soldiers and sheild ward off well.");
        } else {
            System.out.println("Error : army with soldiers and sheild does not ward off well.");
        }
    }


    
}
