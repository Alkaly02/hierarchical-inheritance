package models;

public class Livre extends BibliothequeElement {
	private int nombrePages;
	private String genre;
	public Livre(String titre, String auteur, int anneePublication, int nombrePages, String genre) {
		super(titre, auteur, anneePublication);
		this.nombrePages = nombrePages;
		this.genre = genre;
	}
	
	public void setNombrePages(int nombrePages) {
		this.nombrePages = nombrePages;
	}
	public int getNombrePages() {
		return this.nombrePages;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenre() {
		return this.genre;
	}
	
	public void afficherDetails() {
		super.afficherDetails();
		System.out.println("Nombre de pages: " + this.nombrePages + "\n" +
							"Genre: " + this.genre + "\n");
	}
}
