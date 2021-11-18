package weaponspackage;

abstract class WeaponAbstract implements Weapon {
    private int life;

    WeaponAbstract(int life){
        this.life = life;
    }

    public int deterioration(int lifePoint){
        life -= 1; // every action take 1 life point  
        if (lifePoint >= life){
            lifePoint -= life;
            life = 0;
            return lifePoint;
        }
        life -= lifePoint;
        return 0;
    }

    public int getLife(){
        return life;
    }
}
