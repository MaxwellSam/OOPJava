package visitorpackage;

import armypackage.ArmyComposite;
import soldierpackage.*;
import weaponspackage.*;

public interface InterfaceVisitor {
    public void initialize(); // initialize variables in visitor object
    public void visit(ArmyComposite army);
    public void visit(Trooper trooper);
    public void visit(Infantryman infantryman);
    public void visit(Sword sword);
    public void visit(Shield shield);
    public void visit(Weaponry weaponry);
}
