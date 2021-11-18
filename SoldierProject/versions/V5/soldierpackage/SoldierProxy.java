package soldierpackage;
import visitorpackage.InterfaceVisitor;
import weaponspackage.*;

public class SoldierProxy implements SuperSoldierInterface {
    private SoldierInterface soldier;
    private Weaponry weaponry;

    public SoldierProxy(String type, int life){
        if (type.equals("Trooper")){
            soldier = new Trooper(life);
        } else if (type.equals("Infantryman")){
            soldier = new Infantryman(life);
        } else {
            throw new Error("Soldier type unknown");
        }
        weaponry = new Weaponry();
    }
    @Override
    public int hit() {
        return soldier.hit()+weaponry.hit();
    }

    @Override
    public boolean ward_off(int force) {
        return soldier.ward_off(weaponry.ward_off(force));
    }

    @Override
    public int getLife() {
        return soldier.getLife();
    }

    @Override
    public void addSword(int life) {
        Weapon newSword = new Sword(life);
        weaponry.addWeapon(newSword);
    }

    @Override
    public void addShield(int life) {
       Weapon newShield = new Shield(life);
       weaponry.addWeapon(newShield);
    }

    @Override
    public void accept(InterfaceVisitor visitor) {
        soldier.accept(visitor);
        weaponry.accept(visitor);
    }

    
}
