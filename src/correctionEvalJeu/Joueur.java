package correctionEvalJeu;

import java.util.Random;

public class Joueur {
	private String nom;
	private int sante = 10;;
	private int force;
	private int experience = 1;
	private Arme arme;
	
	public Joueur(String nom) {
		this.nom = nom;
		Random rand = new Random();
		this.force = rand.nextInt(6)+5;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", sante=" + sante + ", force=" + force + ", experience=" + experience + ", arme="
				+ arme + "]";
	}
	
	//Un joueur peut être désarmé : ne plus porter d’armer.
//	public void desarmer(Joueur cible) {
//		cible.arme = null;
//	}
	public void desarmer() {
		this.arme = null;
	}
	
	//Un joueur peut changer d’arme.
	public void changerArme(Arme nouvelleArme) {
		this.arme = nouvelleArme;
	}
	
	//Un joueur peut attaquer un autre joueur.
	public void attaquer(Joueur j2) {
//		if(this.sante == 0) {
//			System.out.println(this.nom+" est mort");
//		}
//		if(j2.sante == 0) {
//			System.out.println(j2.nom+" est mort");
//		}
		if(this.sante == 0 || j2.sante == 0) {
			System.out.println("Vous êtes atteint... de décès.");
		}
		
		int player = this.force * this.sante * this.experience * this.arme.getPuissance();
		int player2 = j2.force * j2.sante * j2.experience * j2.arme.getPuissance();
		
		if(player > player2) {
			this.force += 1;
			j2.sante -= 1;
			System.out.println(this.nom + " a gagné et "+j2.nom+" a perdu.");
			
		}else if (player < player2){
			this.sante -= 1;
			j2.force += 1;
			System.out.println(j2.nom + " a gagné et "+this.nom+" a perdu.");
		}else {
			System.out.println("match nul");
		}
		
		this.experience ++;
		j2.experience ++;
	}

	public boolean etreMort() {
		if(sante == 0) {
			return true;
		}else {
			return false;
		}
	}
	
}
