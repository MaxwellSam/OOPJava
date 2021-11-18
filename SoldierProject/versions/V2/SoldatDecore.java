abstract class SoldatDecore extends SoldatAbstrait {
	protected SoldatImp decore;
	
	SoldatDecore(SoldatImp decore, int vie) {
		super(vie); // Vie du d?cor !
		this.decore = decore;
	}
	
	public boolean parer(int force) {
	    if (vie != 0) {
			if (force > capacite()) {
				if (vie < capacite()) {
					force -= vie;
					vie = 0;
				} else {
					vie -= capacite();
					force  -= capacite();
				}
			} else {
				vie -= force;
				force = 0;
			}
		}
		return decore.parer(force);
	}
    
	public int force() {
	    return decore.force();
	}

	abstract int capacite();
}
