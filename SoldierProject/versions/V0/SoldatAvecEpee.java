public class SoldatAvecEpee {
    int attaque = 1;
    String type = "avec épée";

    public SoldatAvecEpee (Soldat soldatDecore){
        super(soldatDecore);
    }

    public int force (){
    	return super.force() + attaque;
    }
}
