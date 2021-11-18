package soldierpackage;

public class SoldierWithShield extends SoldierDecorator{
    private int capacity_shield = 15; 

    SoldierWithShield(SoldierInterface soldier) {
        super(30, soldier); // shield's life = 30 points
    }

    public int capacity() {
        return  capacity_shield;
    }
}
