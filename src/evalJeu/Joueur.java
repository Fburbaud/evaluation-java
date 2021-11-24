package evalJeu;

public class Joueur {
	private String nom;
	private int sante;
	private int force;
	private int experience;
	private Arme arme;
	
	public Joueur(String nom, int sante, int experience) {
		this.nom = nom;
		this.sante = sante;
		this.experience = experience;
		this.setForce();
	}
	
	public Joueur(String nom) {
		this(nom, 10 , 1);
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
	
	public void setForce() {
		int fmax = 10;
		int fmin = 5;
		int fRange = fmax - fmin + 1;
		this.force = (int)(Math.random() * fRange) + fmin;
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
		if(arme == null) {
			return nom + " : sante = " + sante + ", force = " + force + " et experience = " + experience + ".";
		} else {
			return nom + " : sante = " + sante + ", force = " + force + " et experience = " + experience + ", "+ arme;
		}
	}
	
	public void desarmer(Joueur cible) {
		cible.arme = null;
	}
	
	public void changerArme(Arme arme) {
		this.arme = arme;
	}
	
	private int puissanceAttaque() {
		return this.force*this.sante*this.experience*this.arme.getPuissance();
	}
	
	public String attaque(Joueur cible) {
		if (this.sante == 0 || cible.sante == 0){
			return "Un joueur mort ne peut attaquer ou être attaqué! Non mais!";
		}
		
		if(this.arme == null) {
			return "Veuillez armer "+this.nom +" .";
		}
		
		if(this.puissanceAttaque() > cible.puissanceAttaque()) {
			this.force ++;
			cible.sante --;
			this.experience ++;
			cible.experience ++;
			System.out.println(this.toString());
			System.out.println(cible.toString());
			return "Le vainqueur est "+this.nom+" et le perdant est "+cible.nom;
			
		}else if(this.puissanceAttaque() < cible.puissanceAttaque()) {
			cible.force ++;
			this.sante --;
			cible.experience ++;
			this.experience ++;
			System.out.println(cible.toString());
			System.out.println(this.toString());
			return "Le vainqueur est "+cible.nom+" et le perdant est "+this.nom;
		}else {
			return "Match nul!";
		}
			
	}	
		
		
	
	
	
}
