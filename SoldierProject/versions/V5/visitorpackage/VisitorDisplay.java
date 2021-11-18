package visitorpackage;

import armypackage.ArmyComposite;
import soldierpackage.*;
import weaponspackage.*;

public class VisitorDisplay implements InterfaceVisitor {
    int i;

    @Override
    public void visit(ArmyComposite army) {
        for (SuperSoldierInterface element : army.getArmy()){
            element.accept(this);
            System.out.println();
        }
        if (army.getArmy().isEmpty()){
            System.out.println("army is empty");
        }
    }

    @Override
    public void visit(Sword sword){
        System.out.print(" Sword (life "+sword.getLife()+") ");
    }

    @Override
    public void visit(Shield shield){
        System.out.print(" Shield[life "+shield.getLife()+"] ");
    }

    @Override
    public void visit(Weaponry weaponry){
        System.out.print(" none ");
    }

    @Override
    public void visit(Trooper trooper) {
        i++;
        System.out.print(i+"\t Trooper    \t life = "+trooper.getLife()+"\t Equipment: ");
    }

    @Override
    public void visit(Infantryman infantryman) {
        i++;
        System.out.print(i+"\t Infantryman\t life = "+infantryman.getLife()+"\t Equipment: ");
    }

    @Override
    public void initialize() {
        i = 0;
    }
}
