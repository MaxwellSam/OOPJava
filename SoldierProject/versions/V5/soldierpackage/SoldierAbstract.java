package soldierpackage;

abstract class SoldierAbstract implements SoldierInterface {
    protected int life;

    SoldierAbstract(int life){
        this.life = life;
    }

    public boolean ward_off(int force){
        life = (life > force) ? life-force : 0;
        return life>0;
    }

    public int getLife(){
        return this.life;
    }
}
