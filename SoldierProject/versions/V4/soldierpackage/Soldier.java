package soldierpackage;

public class Soldier {
    private SoldierInterface soldier;

    public Soldier(String type, int life){
        if (type.equals("Trooper")){
            this.soldier = new Trooper(life);
        } else if (type.equals("Infantryman")){
            this.soldier = new Infantryman(life);
        } else {
            throw new Error("Soldier type unknown");
        }
    }

    public void addSword(){
        soldier = new SoldierWithSword(soldier);
    }

    public void addShield(){
        soldier = new SoldierWithShield(soldier);
    }

    public int hit(){
        return soldier.hit();
    }

    public boolean ward_off(int force){
        return soldier.ward_off(force);
    }
}
