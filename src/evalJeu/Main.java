package evalJeu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//instantiation du type d'arme:
		TypeArme epee = TypeArme.EPEE;
		TypeArme masse = TypeArme.MASSE;
		TypeArme couteau = TypeArme.COUTEAU;
		TypeArme pistolet = TypeArme.PISTOLET;
		TypeArme arc = TypeArme.ARC;
		
		//creation des armes:
		Arme excalibur = new Arme("Excalibur", epee , 10);
		Arme marteau = new Arme("Marteau", masse, 5);
		Arme batte = new Arme("Lucille", masse, 10);
		Arme canif = new Arme("SliceAndDice", couteau, 2);
		Arme archeonique = new Arme("Arc archeonique", arc, 20);
		Arme needler = new Arme("Needler", pistolet, 15);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bonjour! Veuillez entrer le nom du joueur 1: ");
		String nomJoueur1 = scan.nextLine();
		
		//création et affichage du joueur 1
		System.out.println("Player 1: ");
		Joueur joueur1 = new Joueur(nomJoueur1);
		System.out.println(joueur1);
		
		//armer le joueur 1 avec un choix
		
		System.out.println("Selectionner votre arme: \n\t1-Excalibur, 2-Marteau, 3-Lucille, 4-SliceAndDice, 5-Arc archeonique, 6-Needler");
		int choix = scan.nextInt();
		
		switch(choix) {
		case 1 : joueur1.setArme(excalibur);
			break;
		case 2 : joueur1.setArme(marteau);
			break;
		case 3 : joueur1.setArme(batte);
			break;
		case 4 : joueur1.setArme(canif);
			break;
		case 5 : joueur1.setArme(archeonique);
			break;
		case 6 : joueur1.setArme(needler);
			break;
		default: System.err.println("Je n'ai pas compris votre réponse. :(");
		}
		scan.nextLine();
		System.out.println(joueur1);
		
		System.out.println("---------");
		
		System.out.println("Veuillez entrer le nom du joueur 1: ");
		String nomJoueur2 = scan.nextLine();
		//création et affichage du joueur 2
		System.out.println("Player 2: ");
		Joueur joueur2 = new Joueur(nomJoueur2);
		System.out.println(joueur2);
		
		//armer le joueur 1 avec le marteau
		System.out.println("Selectionner votre arme: \n\t1-Excalibur, 2-Marteau, 3-Lucille, 4-SliceAndDice, 5-Arc archeonique, 6-Needler");
		int choix2 = scan.nextInt();
		
		switch(choix2) {
		case 1 : joueur2.setArme(excalibur);
			break;
		case 2 : joueur2.setArme(marteau);
			break;
		case 3 : joueur2.setArme(batte);
			break;
		case 4 : joueur2.setArme(canif);
			break;
		case 5 : joueur2.setArme(archeonique);
			break;
		case 6 : joueur2.setArme(needler);
			break;
		default: System.err.println("Je n'ai pas compris votre réponse. :(");
		}
		
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
		
		scan.close();
	}

//	public static int choisirArme(int pick) {
//		switch(pick) {
//		case 1 : joueur1.setArme(excalibur);
//			break;
//		case 2 : joueur1.setArme(marteau);
//			break;
//		case 3 : joueur1.setArme(batte);
//			break;
//		case 4 : joueur1.setArme(canif);
//			break;
//		case 5 : joueur1.setArme(archeonique);
//			break;
//		case 6 : joueur1.setArme(needler);
//			break;
//		default: System.err.println("Je n'ai pas compris votre réponse. :(");
//		}
//	}
}
