package epicerie.produits;

import java.util.Date;

import epicerie.SectionType;

public class Produit
{
	
	public enum SorteSousSection
	{
		ETALAGE, VRAC
	}

	private SectionType section;
	private SorteSousSection typeRangement;
	private String nom;
	private float prix;
	
	public SectionType get_section()
	{
		return section;
	}

	

	private Date dateExpiration;
	private String sorte;
	private String uID;

	public Produit(Produit Produit)
	{
		throw new UnsupportedOperationException();
	}

	public Produit(String Nom, float Prix, Date DateExpiration,
			String Sorte,SorteSousSection TypeRangement)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString()
	{
		throw new UnsupportedOperationException();
	}

	public SorteSousSection get_typeRangement()
	{
		return typeRangement;
	}

	public String getNom()
	{
		return this.nom;
	}

	public float getPrix()
	{
		return this.prix;
	}

	public Date getDateExpiration()
	{
		return this.dateExpiration;
	}

	public String getSorte()
	{
		return this.sorte;
	}

	public String getUID()
	{
		return this.uID;
	}
}