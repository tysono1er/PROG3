package epicerie;

public class Epicerie
{
	public static final int NOMBRE_DE_CAISSE = 5;
	public static final int NOMBRE_INITIAL_PANIER = 5;
	private Debarcadere debarcadere;
	private double revenusTotaux;
	private Section sections;

	// TODO methode ajouteArgent
	// TODO methode retireALimentPerimé

	public Epicerie()
	{
		throw new UnsupportedOperationException();
	}
	
	
	/**
	 * retire tous les élements périmés contenu dans les différentes sections
	 */
	public void retraitElementsPerimes(){
		
	}

	/**
	 * Présentation des produits au clients de l'épicerie
	 */
	public String toString()
	{
		// va chercher les toString des 5objets section et les fusionnes dans un gros toString
		return null;

	}
}