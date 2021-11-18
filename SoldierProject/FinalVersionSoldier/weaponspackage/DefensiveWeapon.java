package weaponspackage;

abstract class DefensiveWeapon extends WeaponAbstract {
    private int force = 0;

    DefensiveWeapon(int life) {
        super(life);
    }

    public int force() {
        return force;
    }
}
