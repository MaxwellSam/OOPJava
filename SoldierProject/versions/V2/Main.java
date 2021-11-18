public class Main {
	public static void main(String[] args) {
		Soldat c = new Soldat("Cavalier", 100);
		Soldat f = new Soldat("Fantassin", 50);
		int i;

		for (i = 0; f.parer(10); i++) ;
		System.out.println("Mort du fantassin en " + i + " coups");

		c.ajouterBouclier(50);
		c.ajouterEpee(10);
		for (i = 0; c.parer(10); i++) ;
		System.out.println("Mort du cavalier avec bouclier en " + i + " coups");

	}
}