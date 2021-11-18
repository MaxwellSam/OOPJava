package visitorpackage;

import armypackage.ArmyComposite;
import soldierpackage.*;
import weaponspackage.*;

public class VisitorCounter implements InterfaceVisitor  {
    int trooperCnt;
    int InfantrymanCnt;

    @Override
    public void visit(ArmyComposite army) {
        for (SuperSoldierInterface element : army.getArmy()){
            element.accept(this);
        }
        System.out.println("nbr trooper = "+trooperCnt);
        System.out.println("nbr infantryman = "+InfantrymanCnt);
    }

    @Override
    public void visit(Sword sword){
        // EMPTY
    }

    @Override
    public void visit(Shield shield){
        // EMPTY
    }

    @Override
    public void visit(Weaponry weaponry){
        // EMPTY
    }

    @Override
    public void visit(Trooper trooper) {
        trooperCnt ++;
    }

    @Override
    public void visit(Infantryman infantryman) {
        InfantrymanCnt ++;
    }

    @Override
    public void initialize() {
        trooperCnt = 0;
        InfantrymanCnt = 0;
    }
    
}
