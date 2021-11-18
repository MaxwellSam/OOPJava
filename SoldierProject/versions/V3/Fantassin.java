public class Fantassin extends SoldatAbstract {
    private int force_f = 1;

    public Fantassin(int vie) {
		super(vie);
	}

    public int force(){
        return force_f;
    }
}
