package epicerie;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import epicerie.produits.Produit;



public class Debarcadere {

	private static final int NOM_SUFFIX_MAX = 0;
	private static final int NOMBRE_MAX_PRODUITS = 10;
	private static final int JOUR_AVANT_PEREMPTION__MAX = 50;
	private static final float PRIX_MIN = 0.25f;
	private static final float PRIX_MAX = 50.0f;
	private final static Map<String, SectionType> SELECTION_PRODUIT = new HashMap<>();
	private static final int QUANTITE_MIN = 5;
	private static final double QUANTITE_MAX = 75;

	public Debarcadere() {
		SELECTION_PRODUIT.put("CEREALE", SectionType.ALLEE);
		SELECTION_PRODUIT.put("MAIS EN CREME", SectionType.ALLEE);
		SELECTION_PRODUIT.put("BARRE TENDRE", SectionType.ALLEE);
		SELECTION_PRODUIT.put("GUIMAUVE", SectionType.ALLEE);
		SELECTION_PRODUIT.put("CANNE FÈVE", SectionType.ALLEE);
		SELECTION_PRODUIT.put("FARINE", SectionType.ALLEE);
		SELECTION_PRODUIT.put("SUCRE", SectionType.ALLEE);
		SELECTION_PRODUIT.put("POULET", SectionType.BOUCHER);
		SELECTION_PRODUIT.put("POISSON", SectionType.BOUCHER);
		SELECTION_PRODUIT.put("BOEUF", SectionType.BOUCHER);
		SELECTION_PRODUIT.put("SAUCISSE", SectionType.BOUCHER);
		SELECTION_PRODUIT.put("POMME", SectionType.VERGER);
		SELECTION_PRODUIT.put("BANANE", SectionType.VERGER);
		SELECTION_PRODUIT.put("POIRE", SectionType.VERGER);
		SELECTION_PRODUIT.put("TOMATE", SectionType.VERGER);
		SELECTION_PRODUIT.put("CELERI", SectionType.VERGER);
		SELECTION_PRODUIT.put("PATATE", SectionType.VERGER);
		SELECTION_PRODUIT.put("NECTARINE", SectionType.VERGER);
		SELECTION_PRODUIT.put("LAIT", SectionType.FRIGIDAIRE);
		SELECTION_PRODUIT.put("OEUF", SectionType.FRIGIDAIRE);
		SELECTION_PRODUIT.put("FROMAGE", SectionType.FRIGIDAIRE);
		SELECTION_PRODUIT.put("YOUGOURT", SectionType.FRIGIDAIRE);
		SELECTION_PRODUIT.put("PAIN", SectionType.BOULANGERIE);
		SELECTION_PRODUIT.put("CROISSANT", SectionType.BOULANGERIE);
		SELECTION_PRODUIT.put("MUFFIN", SectionType.BOULANGERIE);
		SELECTION_PRODUIT.put("TARTE AU POMME", SectionType.BOULANGERIE);

	}

	/**
	 * La méthode crée des produits aléatoirement pour simuler le
	 * réapprovisionnement de l'épicerie.
	 * 
	 * @return un lot de produit
	 */
	public List<InfoChargement> dechargerRandom() {

		// On simule le contenud'un camion
		List<InfoChargement> retCol = new ArrayList<>();

		// on choisit le produit au hasard
		int nombreProduits = (int) (Math.random() * NOMBRE_MAX_PRODUITS);
		List<String> produitSet = new ArrayList<>(SELECTION_PRODUIT.keySet());
		Collections.shuffle(produitSet);// donc un produit ne peut pas se
										// répéter!
		Iterator<String> iter = produitSet.iterator();

		// Important nombre de produits doit être inferieur à
		// SELECTION_PRODUIT.size()
		assert nombreProduits < SELECTION_PRODUIT.size() : "mauvaise configuration du nombre de produit";
		for (int i = 0; i < nombreProduits; i++) {

			// On choisit le produit
			String produit = iter.next();
			int nameSuffix = (int) (Math.random() * NOM_SUFFIX_MAX);
			SectionType type = SELECTION_PRODUIT.get(produit);

			// on fixe le prix et la quantité
			float prixProduit = (float) (PRIX_MIN + Math.random() * PRIX_MAX);
			int quantiteProduit = (int) (QUANTITE_MIN + Math.random() * QUANTITE_MAX);

			// on crée une date d'expiration
			int jourAvantPeremption = (int) (Math.random() * JOUR_AVANT_PEREMPTION__MAX);
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DAY_OF_YEAR, jourAvantPeremption);
			Date datePeremption = calendar.getTime();
			Produit nouveauProduit = new Produit(produit + nameSuffix, prixProduit, datePeremption, produit);
			retCol.add(new InfoChargement(quantiteProduit, type, nouveauProduit));
		}

		return retCol;
	}
	
	/**
	 * La méthode crée des produits prédéterminé pour simuler le
	 * réapprovisionnement de l'épicerie.
	 * 
	 * @return un lot de produit
	 */
	public List<InfoChargement> decharger() {

		// On simule le contenud'un camion
		List<InfoChargement> retCol = new ArrayList<>();

		// on choisit le produit au hasard
		int nombreProduits = NOMBRE_MAX_PRODUITS;
		List<String> produitSet = new ArrayList<>(SELECTION_PRODUIT.keySet());
		Collections.sort(produitSet); // pour assurer qu'on a toujouts le meme ordre
		Iterator<String> iter = produitSet.iterator();

		// Important nombre de produits doit être inferieur à
		// SELECTION_PRODUIT.size()
		assert nombreProduits < SELECTION_PRODUIT.size() : "mauvaise configuration du nombre de produit";
		for (int i = 0; i < nombreProduits; i++) {

			// On choisit le produit
			String produit = iter.next();
			int nameSuffix = i;
			SectionType type = SELECTION_PRODUIT.get(produit);

			// on fixe le prix et la quantité
			float prixProduit =PRIX_MIN ;
			int quantiteProduit = QUANTITE_MIN+i;

			// on crée une date d'expiration
			int jourAvantPeremption = JOUR_AVANT_PEREMPTION__MAX+i;
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DAY_OF_YEAR, jourAvantPeremption);
			Date datePeremption = new Date(0);// ne doit pas changer
			Produit nouveauProduit = new Produit(produit + nameSuffix, prixProduit, datePeremption, produit);
			retCol.add(new InfoChargement(quantiteProduit, type, nouveauProduit));
		}

		return retCol;
	}

	public static class InfoChargement {
		private int quantite;
		private SectionType type;
		private Produit produit;

		public InfoChargement(int quantite, SectionType type, Produit produit) {
			super();
			this.quantite = quantite;
			this.type = type;
			this.produit = produit;
		}

		public int getQuantite() {
			return quantite;
		}

		public SectionType getType() {
			return type;
		}

		public Produit getProduit() {
			return produit;
		}

		@Override
		public String toString() {
			return "InfoChargement [quantite=" + quantite + ", type=" + type + ", produit=" + produit + "]";
		}
		
		

	}

}