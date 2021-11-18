package weaponspackage;

abstract class OffensiveWeapon extends WeaponAbstract {
    private int capacity = 0;

    OffensiveWeapon(int life) {
        super(life);
    }

    public int capacity(){
        return capacity;
    }

}
