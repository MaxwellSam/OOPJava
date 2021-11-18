abstract class SoldatDecorator implements Soldat {
    private Soldat soldatDecore;
    //private Arme arme;

    public SoldatDecorator (Soldat soldatDecore){
        this.soldatDecore = soldatDecore;
    }
}
