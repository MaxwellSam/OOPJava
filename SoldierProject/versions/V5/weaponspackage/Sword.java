package weaponspackage;

import visitorpackage.InterfaceVisitor;

public class Sword extends OffensiveWeapon {
    private int force_sword = 20;

    public Sword(int life) {
        super(life);
    }

    public int force(){
        return force_sword;
    }

    @Override
    public void accept(InterfaceVisitor visitor){
        visitor.visit(this);
    }
}
