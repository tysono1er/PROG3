package epicerie.produits;

import java.util.Date;
import java.util.UUID;

public class Produit {

	private String nom;
	private float prix;
	private Date dateExpiration;
	private String sorte;
	private String UID;

	
	public Produit(Produit produit) {
		super();
		this.nom = produit.nom;
		this.prix = produit.prix;
		this.dateExpiration = produit.dateExpiration;
		this.sorte = produit.sorte;
		//L'UID reste unique cependant
		UID = UUID.randomUUID().toString();
	}
	
	public Produit(String nom, float prix, Date dateExpiration, String sorte) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.dateExpiration = dateExpiration;
		this.sorte = sorte;
		UID = UUID.randomUUID().toString();
	}

	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", prix=" + prix + ", dateExpiration=" + dateExpiration + ", sorte=" + sorte
				+ "]";
	}

	public String getSorte() {
		return sorte;
	}

	public String getNom() {
		return nom;
	}

	public float getPrix() {
		return prix;
	}

	public Date getDateExpiration() {
		return dateExpiration;
	}

	public String getUID() {
		return UID;
	}
	
	

}
