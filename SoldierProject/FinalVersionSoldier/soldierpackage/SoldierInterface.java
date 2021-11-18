package soldierpackage;

import visitorpackage.InterfaceVisitor;

public interface SoldierInterface {
    public int hit();
    public boolean ward_off(int force);
    public int getLife();
    public void accept(InterfaceVisitor visitor);
}
