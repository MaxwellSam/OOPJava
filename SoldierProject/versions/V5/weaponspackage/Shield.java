package weaponspackage;

import visitorpackage.InterfaceVisitor;

public class Shield extends DefensiveWeapon {
    private int capacity = 15;
    
    public Shield(int life) {
        super(life);
    }

    public int capacity(){
        return capacity;
    }

    @Override
    public void accept(InterfaceVisitor visitor){
        visitor.visit(this);
    }

}
