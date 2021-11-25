package correctionEvalJeu;

public class Arme {
	private String nom;
	private int puissance;
	private TypeArme type;
	public Arme(String nom, int puissance, TypeArme type) {
		super();
		this.nom = nom;
		this.puissance = puissance;
		this.type = type;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	public TypeArme getType() {
		return type;
	}
	public void setType(TypeArme type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Arme [nom=" + nom + ", puissance=" + puissance + ", type=" + type + "]";
	}
}
