abstract class SoldatDecore implements Soldat {
    Soldat soldat;

    SoldatDecore(Soldat soldat){
        this.soldat = soldat;
    }

    public boolean parer(int force){
        if (force < protection()){
            force = 0;
        } else {
            force -= protection();
        }
        return soldat.parer(force);
    }
    
    abstract int protection ();
}
