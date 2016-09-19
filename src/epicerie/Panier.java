package epicerie;

import java.util.List;

import epicerie.produits.Produit;

public class Panier
{

	// TODO methode ajouter
	// TODO enlever, constructeur ,get,set

	private List<Produit> contenu;

	public Panier(List<Produit> contenu)
	{
		super();
		this.contenu = contenu;
	}

	/**
	 * Methode ajoutant un produit dans le panier.
	 * @param panier le panier auquel on ajoute un produit
	 * @param produit le produit qu'on ajoute dans le panier
	 */
	public void ajouteProduit(Panier panier, Produit produit)
	{
		
	}
	
	/**
	 * methode pour enlever un produit dans le panier désiré
	 * @param panier le panier auquel on enleve un produit
	 * @param produit le produit qu'on veut enlever
	 * @param nombre le nombre du même produit qu'on enlève
	 */
	public void enleveProduit(Panier panier, Produit produit , int nombre)
	{
		// doit verifier si le produit est dans le panier si oui on regarde si il en as au moins le nombre à enlever
		
		
	}

	public List<Produit> getContenu()
	{
		return contenu;
	}

	public void setContenu(List<Produit> contenu)
	{
		this.contenu = contenu;
	}

}