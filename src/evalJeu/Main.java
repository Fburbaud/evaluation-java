package evalJeu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//creation des armes:
		Arme excalibur = new Arme("Excalibur", TypeArme.EPEE , 10);
		Arme marteau = new Arme("Marteau", TypeArme.MASSE, 5);
		Arme batte = new Arme("Lucille", TypeArme.MASSE, 10);
		Arme canif = new Arme("SliceAndDice", TypeArme.COUTEAU, 2);
		Arme archeonique = new Arme("Arc archeonique", TypeArme.ARC, 20);
		Arme needler = new Arme("Needler", TypeArme.PISTOLET, 15);
		
		ArrayList<Arme> armes = new ArrayList<>();
		armes.add(excalibur);
		armes.add(marteau);
		armes.add(batte);
		armes.add(canif);
		armes.add(archeonique);
		armes.add(needler);
		
		ArrayList<Joueur> joueurs = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bonjour! Veuillez entrer le nombre de joueur(s): ");
		int nbrJoueur = scan.nextInt();
		scan.nextLine();
		createPlayer(scan, nbrJoueur, armes, joueurs);

		System.out.println("C'est parti!");
		System.out.println("-----------");
		
//		System.out.println("Round 1");
//		System.out.println(joueur2.attaque(joueur1));
//		
//		System.out.println("Round 2");
//		System.out.println(joueur2.attaque(joueur1));
//		
//		System.out.println("Round 3");
//		System.out.println(joueur1.attaque(joueur2));
//		
//		System.out.println("Round 4");
//		System.out.println(joueur1.attaque(joueur2));
//		
//		System.out.println("Round 5");
//		System.out.println(joueur1.attaque(joueur2));
//		
//		System.out.println("Round 6");
//		System.out.println(joueur1.attaque(joueur2));
//		
//		System.out.println("Round 7");
//		joueur1.desarmer(joueur2);
//		System.out.println(joueur2.attaque(joueur1));
//		joueur2.changerArme(marteau);
//		
//		System.out.println("Round 8");
//		System.out.println(joueur2.attaque(joueur1));
//		
//		System.out.println("Round 9");
//		System.out.println(joueur1.attaque(joueur2));
//		
//		System.out.println("Round 10");
//		System.out.println(joueur1.attaque(joueur2));
//		
//		System.out.println("Round 11");
//		System.out.println(joueur1.attaque(joueur2));
//		System.out.println(joueur2.attaque(joueur1));
		
		scan.close();
	}
	public static void showWeapons(ArrayList<Arme> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.print((i+1)+"- "+array.get(i).getNom()+" ");
		}
	}
	
	public static void createPlayer(Scanner scan, int nbrPlayer, ArrayList<Arme> armes, ArrayList<Joueur> joueurs) {
		if(nbrPlayer > 1) {
			for (int i = 0; i < nbrPlayer; i++) {
				//saisie du nom de joueur 1
				System.out.println("Veuillez entrer le nom du joueur "+(i+1)+" :");
				String nomJoueur = scan.nextLine();
				
				//création et affichage du joueur 1
				System.out.println("Player "+(i+1)+" :");
				Joueur player = new Joueur(nomJoueur);
				//on ajoute le joueur à la liste
				joueurs.add(player);
				//on affioche les infos du joueur
				System.out.println(joueurs.get(i));
				
				//armer le joueur avec un choix
				System.out.println("Selectionner votre arme: ");
				showWeapons(armes);
				//System.out.println("\n");
				int choix = scan.nextInt();
				joueurs.get(i).choisirArme(armes, choix);
				
				scan.nextLine();
				System.out.println(joueurs.get(i));
				
				System.out.println("---------");
			}
		}else if (nbrPlayer == 1) {
			//saisie du nom de joueur 1
			System.out.println("Veuillez entrer le nom du joueur 1 :");
			String nomJoueur = scan.nextLine();
			
			//création et affichage du joueur 1
			System.out.println("Player 1 :");
			Joueur player = new Joueur(nomJoueur);
			//on ajoute le joueur à la liste
			joueurs.add(player);
			//on affioche les infos du joueur
			System.out.println(player);
			
			//armer le joueur avec un choix
			System.out.println("Selectionner votre arme: ");
			showWeapons(armes);
			//System.out.println("\n");
			int choix = scan.nextInt();
			player.choisirArme(armes, choix);
			
			scan.nextLine();
			System.out.println(player);
			
			System.out.println("---------");
			Joueur ordinateur = new Joueur("Ordinateur");
			joueurs.add(ordinateur);
			System.out.println(ordinateur);
			int armeHasard = (int)(Math.random() * armes.size()) + 1;
			ordinateur.choisirArme(armes, armeHasard);
			System.out.println(ordinateur);
		}else {
			System.err.println("Merci d'entrez un nombre de joueur(s) correct");
		}
	}
}
