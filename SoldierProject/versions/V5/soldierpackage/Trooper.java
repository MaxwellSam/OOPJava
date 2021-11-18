package soldierpackage;

import visitorpackage.InterfaceVisitor;

public class Trooper extends SoldierAbstract {
    private static final int force_trooper = 10;

    //private static Waepons waepons;
    public Trooper(int life){
        super(life);
    }

    public int hit(){
        return force_trooper;
    }

    @Override
    public void accept(InterfaceVisitor visitor) {
        visitor.visit(this);
    }

}
