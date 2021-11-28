package correctionEvalJeu;

public class MainC {

	public static void main(String[] args) {
		Joueur zelda = new Joueur("Zelda");
		
		Arme arme1 = new Arme("Excalibur", 10, TypeArme.EPEE);
		Arme arme2 = new Arme("Mateau", 5, TypeArme.MASSE);
		zelda.changerArme(arme1);
		
		System.out.println(zelda);

		Joueur mario = new Joueur("Mario");
		mario.changerArme(arme2);
		System.out.println(mario);
		
		System.out.println("BATTEZ VOUS");	
		
		zelda.attaquer(mario);
		
		while(!zelda.etreMort() && !mario.etreMort()){
			zelda.attaquer(mario);
			System.out.println("Joueur 1 : "+zelda);
			System.out.println("Joueur 2 : "+mario);
		}
	}

}
