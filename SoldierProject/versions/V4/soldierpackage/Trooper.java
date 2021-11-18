package soldierpackage;

public class Trooper extends SoldierAbstract {
    private static final int force_trooper = 10;
    public Trooper(int life){
        super(life);
    }

    public int hit(){
        return force_trooper;
    }
}
