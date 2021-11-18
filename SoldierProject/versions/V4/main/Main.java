package main;

import soldierpackage.*;

public class Main {
    public static void main(String[] args) {
        Soldier trooper = new Soldier("Trooper", 50);
        Soldier infantryman = new Soldier("Infantryman",50);
        int i; 

        System.out.println("Killing of an Infantryman by a Trooper without a Shield");
        for (i=0; infantryman.ward_off(trooper.hit()); i++);
        System.out.println("Infantryman died in "+(i+1)+" hits.");

        infantryman = new Soldier("Infantryman",50);
        infantryman.addShield();
        
        System.out.println("\nKilling of an Infantryman with a Shield by a Trooper");
        for (i=0; infantryman.ward_off(trooper.hit()); i++);
        System.out.println("Infantryman died in "+(i+1)+" hits.");

        System.out.println("\nKilling of a Trooper by an Infantryman without a Sword");
        infantryman.addSword();
        for (i=0; trooper.ward_off(infantryman.hit()); i++);
        System.out.println("Trooper died in "+(i+1)+" hits.");

        trooper = new Soldier("Trooper", 50);
        System.out.println("\nKilling of a Trooper by an Infantryman with a Sword");
        infantryman.addSword();
        for (i=0; trooper.ward_off(infantryman.hit()); i++);
        System.out.println("Trooper died in "+(i+1)+" hits.");
    }
}
