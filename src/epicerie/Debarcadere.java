package epicerie;

import java.util.HashMap;
import epicerie.produits.Produit;

public class Debarcadere {
	private static final int NOM_SUFFIX_MAX = 0;
	private static final int NOMBRE_MAX_PRODUITS = 10;
	private static final int JOUR_AVANT_PEREMPTION__MAX = 50;
	private static final float PRIX_MIN = 0.25f;
	private static final float PRIX_MAX = 50.0f;
	private static final java.util.Map<String, SectionType> SELECTION_PRODUIT = new HashMap<>();
	private static final int QUANTITE_MIN = 5;
	private static final double QUANTITE_MAX = 75;

	public Debarcadere() {
		throw new UnsupportedOperationException();
	}

	/**
	 * La méthode crée des produits aléatoirement pour simuler le
	 * réapprovisionnement de l'épicerie.
	 * @return un lot de produit
	 */
	public java.util.List<epicerie.Debarcadere.InfoChargement> dechargerRandom() {
		throw new UnsupportedOperationException();
	}

	/**
	 * La méthode crée des produits prédéterminé pour simuler le
	 * réapprovisionnement de l'épicerie.
	 * @return un lot de produit
	 */
	public java.util.List<epicerie.Debarcadere.InfoChargement> decharger() {
		throw new UnsupportedOperationException();
	}
	public static class InfoChargement {
		private int quantite;
		private SectionType type;
		private Produit produit;

		public InfoChargement(int Quantite, SectionType Type, Produit Produit) {
			throw new UnsupportedOperationException();
		}

		@Override
		public String toString() {
			throw new UnsupportedOperationException();
		}

		public int getQuantite() {
			return this.quantite;
		}

		public SectionType getType() {
			return this.type;
		}

		public Produit getProduit() {
			return this.produit;
		}
	}
}