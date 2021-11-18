package weaponspackage;

import visitorpackage.InterfaceVisitor;

public interface Weapon {
    public int force();
    public int capacity();
    public int deterioration(int lifePoint); // True if life = 0
    public int getLife();
    public void accept(InterfaceVisitor visitor);
}

