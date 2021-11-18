package soldierpackage;

public class SoldierWithSword extends SoldierDecorator {
    private int capacity_sword = 5;
    private int force_sword = 10; 

    public SoldierWithSword(SoldierInterface soldier) {
        super(30, soldier); // sword's life = 30 points
    }

    public int hit(){
        if (life > 0){
            return soldierDecorated.hit() + force_sword;
        } else {
            return soldierDecorated.hit();
        }
    }

    public int capacity() {
        return capacity_sword;
    }
}