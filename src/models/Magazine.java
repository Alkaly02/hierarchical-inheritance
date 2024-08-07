package models;

public class Magazine extends BibliothequeElement {
	private String editeur, frequencePublication;
	
	public Magazine(String titre, String auteur, int anneePublication, String editeur,String frequencePublication) {
		super(titre, auteur, anneePublication);
		this.editeur = editeur;
		this.frequencePublication = frequencePublication;
	}
	
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public String getEditeur() {
		return this.editeur;
	}
	
	public void setFrequencePublication(String frequencePublication) {
		this.frequencePublication = frequencePublication;
	}
	public String getFrequencePublication() {
		return this.frequencePublication;
	}
	
	public void afficherDetails() {
		super.afficherDetails();
		System.out.println("Editeur: " + this.editeur + "\n" +
				"Genre: " + this.frequencePublication + "\n");
	}
}
