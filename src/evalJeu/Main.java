package evalJeu;

public class Main {

	public static void main(String[] args) {
		
		//instantiation du type d'arme:
		TypeArme epee = TypeArme.EPEE;
		TypeArme masse = TypeArme.MASSE;
		
		//creation des armes:
		Arme excalibur = new Arme("Excalibur", epee , 10);
		Arme marteau = new Arme("Marteau", masse, 5);
		
		//création et affichage du joueur 1
		System.out.println("Player 1: ");
		Joueur joueur1 = new Joueur("Zelda");
		System.out.println(joueur1);
		
		//armer le joueur 1 avec l'épée excalibur
		joueur1.changerArme(excalibur);
		System.out.println(joueur1);
		
		System.out.println("---------");
		
		//création et affichage du joueur 2
		System.out.println("Player 2: ");
		Joueur joueur2 = new Joueur("Mario");
		System.out.println(joueur2);
		
		//armer le joueur 1 avec le marteau
		joueur2.changerArme(marteau);
		System.out.println(joueur2);
		
		System.out.println("-----------");
		System.out.println("C'est parti!");
		System.out.println("-----------");
		System.out.println("Round 1");
		System.out.println(joueur2.attaque(joueur1));
		System.out.println("Round 2");
		System.out.println(joueur2.attaque(joueur1));
		System.out.println("Round 3");
		System.out.println(joueur1.attaque(joueur2));
		System.out.println("Round 4");
		System.out.println(joueur1.attaque(joueur2));
		System.out.println("Round 5");
		System.out.println(joueur1.attaque(joueur2));
		System.out.println("Round 6");
		System.out.println(joueur1.attaque(joueur2));
		System.out.println("Round 7");
		joueur1.desarmer(joueur2);
		System.out.println(joueur2.attaque(joueur1));
		joueur2.changerArme(marteau);
		System.out.println("Round 8");
		System.out.println(joueur2.attaque(joueur1));
		System.out.println("Round 9");
		System.out.println(joueur1.attaque(joueur2));
		System.out.println("Round 10");
		System.out.println(joueur1.attaque(joueur2));
		System.out.println("Round 11");
		System.out.println(joueur1.attaque(joueur2));
		System.out.println(joueur2.attaque(joueur1));
		
	}

}
