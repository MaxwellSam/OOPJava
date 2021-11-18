package weaponspackage;

import visitorpackage.InterfaceVisitor;

public class Weaponry {
    private Weapon offensiveWeapon;
    private Weapon deffensiveWeapon;

    public void addWeapon(Weapon weapon){
        if (weapon instanceof DefensiveWeapon) {
            this.deffensiveWeapon = weapon;
        } else if (weapon instanceof OffensiveWeapon){
            this.offensiveWeapon = weapon;
        } 
    }

    public int hit(){
        if (offensiveWeapon != null){
            int force = offensiveWeapon.force();
            offensiveWeapon.deterioration(0);
            if (offensiveWeapon.getLife() == 0){
                offensiveWeapon = null;
            };
            return force;
        } 
        return 0;
    }

    public int ward_off(int force){
        if (deffensiveWeapon != null){
            if (force > deffensiveWeapon.capacity()){
                force -= deffensiveWeapon.capacity();
                force = deffensiveWeapon.deterioration(force);
                if (force != 0){
                    deffensiveWeapon = null;
                }
            } else if (force < deffensiveWeapon.capacity()){
                force = 0;
                deffensiveWeapon.deterioration(0);
                if (deffensiveWeapon.getLife() <= 0){
                    deffensiveWeapon = null;
                }
            }
            return force;
        }
        return force;
    }

    public void accept(InterfaceVisitor visitor){

        if (offensiveWeapon != null){
            offensiveWeapon.accept(visitor);
        } 
        if (deffensiveWeapon != null){
            deffensiveWeapon.accept(visitor);
        } 
        if ((offensiveWeapon == null) && (deffensiveWeapon == null)){
            visitor.visit(this);
        }
    }

}
