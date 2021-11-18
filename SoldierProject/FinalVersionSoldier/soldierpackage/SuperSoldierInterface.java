package soldierpackage;

import visitorpackage.InterfaceVisitor;

public interface SuperSoldierInterface {
    public int hit();
    public boolean ward_off(int force);
    public int getLife();
    public void addSword(int life);
    public void addShield(int life);
    public void accept(InterfaceVisitor visitor);
}
