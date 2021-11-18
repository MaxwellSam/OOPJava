public class SoldatAvecBouclier extends SoldatDecorator {
    int defence = 1;
    String type = "avec bouclier";
    
    public SoldatAvecBouclier (Soldat soldatDecore){
        super(soldatDecore);
    }

    public boolean parer(int force){
        vie = (vie > force) ? vie + defence - force : 0;
        return vie > 0;       
    }
}
