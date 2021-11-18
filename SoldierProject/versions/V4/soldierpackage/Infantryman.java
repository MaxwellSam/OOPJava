package soldierpackage;

public class Infantryman extends SoldierAbstract {
    private static final int force_infantryman = 5;

    public Infantryman(int life){
        super(life);
    }

    public int hit(){
        return force_infantryman;
    }
}
