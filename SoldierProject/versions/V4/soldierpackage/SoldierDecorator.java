package soldierpackage;

abstract class SoldierDecorator extends SoldierAbstract {
    protected SoldierInterface soldierDecorated;

    SoldierDecorator(int life, SoldierInterface soldier){
        super(life); // Decore's life
        this.soldierDecorated = soldier;
    }

    public boolean ward_off(int force){
        if (life != 0){
            if (force > capacity()){
                if (force > life){
                    force -= life;
                    life = 0;
                } else {
                    life -= capacity();
                    force -= capacity();
                }
            } else {
                life -= force;
                force = 0;
            }
        }
        return soldierDecorated.ward_off(force);
    }

    public int hit(){
        return soldierDecorated.hit();
    }

    public int getLifeDecore(){
        return life;
    }

    public int getLifeSoldier(){
        return soldierDecorated.getLife();
    }

    abstract int capacity();
}
