public class SoldatAvecBouclier extends SoldatDecore {
    private int capacite_bouclier = 3
    
    public SoldatAvecBouclier(Soldat soldat){
        super(soldat);
    }

    int capacite (){
        return capacite_bouclier;
    }
}
