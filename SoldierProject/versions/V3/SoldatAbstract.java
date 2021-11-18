abstract class SoldatAbstract implements Soldat {
    private int vie; 
    
    SoldatAbstract(int vie){
        this.vie = vie;
    }

    boolean parer(int force){
        vie = (vie > force) ? vie-force : 0; // if (vie > force) -> vie = vie - force ; else vie = 0
	return vie > 0;
    }
}
