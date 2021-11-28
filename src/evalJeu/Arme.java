package evalJeu;

import java.util.ArrayList;

public class Arme {
	private String nom;
	private TypeArme type;
	private int puissance;
	
	public Arme(String nom, TypeArme type, int puissance) {
		this.nom = nom;
		this.type = type;
		this.puissance = puissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TypeArme getType() {
		return type;
	}

	public void setType(TypeArme type) {
		this.type = type;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return "Arme : " + nom + ", puissance = " + puissance + ", type d'arme = " + type + ".";
	}
}
