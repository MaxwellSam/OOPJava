package soldierpackage;

import visitorpackage.InterfaceVisitor;

public class Soldier implements SuperSoldierInterface {
    private SuperSoldierInterface soldier;

    public Soldier(String type, int life){
        soldier = new SoldierProxy(type, life);
    }

    @Override
    public int hit() {
        return soldier.hit();
    }

    @Override
    public boolean ward_off(int force) {
        return soldier.ward_off(force);
    }

    @Override
    public int getLife() {
        return soldier.getLife();
    }

    @Override
    public void addSword(int life) {
        soldier.addSword(life);
    }

    @Override
    public void addShield(int life) {
        soldier.addShield(life);
    }

    @Override
    public void accept(InterfaceVisitor visitor) {
        soldier.accept(visitor);
    }
    
}
