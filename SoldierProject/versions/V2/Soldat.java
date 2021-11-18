public class Soldat {
  private SoldatImp soldat;

  public Soldat(String type,int vie) {
    if (type.equals("Cavalier")) {
        soldat = new Cavalier(vie);
    }
    else if (type.equals("Fantassin")) {
      soldat = new Fantassin(vie);
    }
    else {
      throw new Error("Type de soldat inconnu");
    }
  }

  public void ajouterEpee(int s) {
    soldat = new SoldatAvecEpee(soldat,s);
  }
  public void ajouterBouclier(int s) {
    soldat = new SoldatAvecBouclier(soldat,s);
  }

  public int force() {
    return soldat.force();
  }

  public boolean parer(int force) {
      return soldat.parer(force);
  }
}
