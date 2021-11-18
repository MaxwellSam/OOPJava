package main;

import soldierpackage.*;
import armypackage.*;
import visitorpackage.*;

public class MainBattleField {

    public static void main(String[] args) {
        // Creation army One 
        ArmyComposite A1 = new ArmyComposite();
        // Creation army Two 
        ArmyComposite A2 = new ArmyComposite();

        // Add Troopers to armys
        addTroopers(A1, 30, 7);
        addTroopers(A2, 30, 5);   
        
        System.out.println("\nFight between A1 and A2");
        System.out.println("life A1 = "+A1.getLife());
        System.out.println("life A2 = "+A2.getLife());
        System.out.println("fight start");
        int cnt = 0;
        for (;A2.ward_off(A1.hit());){
            cnt ++;
            System.out.println("life A2 = "+A2.getLife());
        }
        System.out.println("A2 died in "+cnt+" hits");

        // with sword now ! 
        addTroopers(A2, 30, 5); 
        System.out.println("\nFight between A1 and A2");
        System.out.println("add sword to A1 !");
        A1.addSword(30);
        cnt = 0;
        for (;A2.ward_off(A1.hit());){
            cnt ++;
            System.out.println("life A2 = "+A2.getLife());
        }
        System.out.println("A2 died in "+cnt+" hits");

        // well ! now with shield !! 
        addTroopers(A2, 30, 5);
        System.out.println("\nFight between A1 and A2");
        System.out.println("add shield to A2 !");
        A2.addShield(30);
        cnt = 0;
        for (;A2.ward_off(A1.hit());){
            cnt ++;
            System.out.println("life A2 = "+A2.getLife());
        }
        System.out.println("A2 died in "+cnt+" hits");

        // well ! now with shield !! 
        addTroopers(A2, 30, 5);

        // test visitor
        System.out.println("\nVisiting A1");
        InterfaceVisitor counterSoldat = new VisitorCounter();
        counterSoldat.initialize(); // do not forget to initialize visitor before use it
        counterSoldat.visit(A1);
        System.out.println("add 3 infantrymans");
        addInfantryman(A1, 30, 3);
        counterSoldat.initialize();
        counterSoldat.visit(A1);
        System.out.println("List soldiers in A1 :");
        InterfaceVisitor exploreSoldier = new VisitorDisplay();
        exploreSoldier.initialize(); 
        exploreSoldier.visit(A1);
        // add a shield to army
        System.out.println("add a shield");
        System.out.println("New list soldiers in A1 :");
        A1.addShield(30);
        exploreSoldier.initialize();
        exploreSoldier.visit(A1);

        System.out.println("\nNew exploration with an empty army A3 :");
        ArmyComposite A3 = new ArmyComposite();
        exploreSoldier.initialize();
        exploreSoldier.visit(A3);

        System.out.println("\nAdd A3 in A1:");
        System.out.println("\nadd 3 troopers with life 120 to A3:");
        addTroopers(A3, 120, 3);
        System.out.println("list A3");
        exploreSoldier.initialize();
        exploreSoldier.visit(A3);
        A1.addElement(A3);
        System.out.println("list A1");
        exploreSoldier.initialize();
        exploreSoldier.visit(A1);
        
        System.out.println("\n ### Battle between A1 and A2 ### \n");
        System.out.println("add 6 troopers to A2 and 3 infantrymans");
        addTroopers(A2, 50, 6);
        addInfantryman(A2, 50, 3);
        System.out.println("and add a sword to A2");
        A2.addSword(50);
        System.out.println("\nInitial list of armys :");
        System.out.println("A1 ........................................................");
        exploreSoldier.initialize();
        exploreSoldier.visit(A1);
        System.out.println("A2 ........................................................");
        exploreSoldier.initialize();
        exploreSoldier.visit(A2);
        System.out.println("\nStart fighting !");
        int h = 0; // hit force
        int cnt1 = 0;
        int cnt2 = 0;
        while (true){
            h = A2.hit();
            System.out.println("\n*** A2 hit at "+h);
            cnt1++;
            if (A1.ward_off(h)){
                System.out.println("list A1");
                exploreSoldier.initialize();
                exploreSoldier.visit(A1);
            } else {
                    System.out.println("\n --> A1 died in "+cnt1+" hits.");
                    break;
                }
            h = A1.hit();
            System.out.println("\n*** A1 hit at "+h);
            cnt2 ++;
            if (A2.ward_off(h)){
                System.out.println("list A2");
                exploreSoldier.initialize();
                exploreSoldier.visit(A2);
            } else {
                    System.out.println("\n --> A2 died in "+cnt2+" hits.");
                    break;
                }
        }
        System.out.println("\nEnd of battle.");
    }

    static void addTroopers(ArmyComposite army, int life, int nbr){
        for (int i = 0; i < nbr; i ++){
            SuperSoldierInterface trooper = new Soldier("Trooper", life);
            army.addElement(trooper);
        }
    }

    static void addInfantryman(ArmyComposite army, int life, int nbr){
        for (int i = 0; i < nbr; i ++){
            SuperSoldierInterface infantryman = new Soldier("Infantryman", life);
            army.addElement(infantryman);
        }
    }
}


