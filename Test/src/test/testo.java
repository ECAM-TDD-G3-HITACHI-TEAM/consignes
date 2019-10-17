package test;

import java.util.Scanner;

public class testo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perso Jack = new Perso(100, 10, 0);
		Mob skel = new Mob(30,10,0);
		Jeu game = new Jeu(skel, Jack);
		game.Boucle(Jack);
	}

}
