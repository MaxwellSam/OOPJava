public class SoldatAvecEpee extends SoldatDecore {
	private static final int CAPACITE_EPEE = 5;	
	private static final int FORCE_EPEE = 5;
	
	public SoldatAvecEpee(SoldatImp s, int solidite) {
		super(s, solidite);
	}
	
	public int force() {
		return decore.force() + FORCE_EPEE;
	}
	
	int capacite() {
	    return CAPACITE_EPEE;
	}
}
