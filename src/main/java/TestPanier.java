import static org.junit.Assert.assertEquals;

public class TestPanier {

	public static void main(String[] args) throws Exception {
		Orange orange = new Orange(2,"France");
		Orange orange2 = new Orange(3,"Espagne");
		Panier panier = new Panier();
		Panier panier2 = new Panier();
		panier.ajoute(orange);
		panier.ajoute(orange2);
		panier2.ajoute(orange);
		panier2.ajoute(orange2);
		
		panier.equals(panier2);
		System.out.println(panier.equals(panier2));

	}

}
