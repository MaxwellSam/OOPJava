public class SoldatAvecBouclier extends SoldatDecore {
	private static final int CAPACITE_BOUCLIER = 10;
	
	public SoldatAvecBouclier(SoldatImp s, int solidite) {
		super(s, solidite);
	}
	
	int capacite() {
	    return CAPACITE_BOUCLIER;
	}
}
