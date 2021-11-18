public class Cavalier extends SoldatAbstract {
    private int force_c = 2;

    public Cavalier (int vie){
        super(vie);
    }

    public int force (){
        return force_c;
    }
}
