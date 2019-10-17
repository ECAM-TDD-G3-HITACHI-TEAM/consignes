package test;

import java.util.Scanner;

public class Jeu {
	Perso joueur;
	Mob mob;
	int palier = 0;
	int combat = 0;
	int score = 0;
	int tour = 0;
	
	
	public Jeu(Mob mob, Perso joueur) {
		this.joueur = joueur;
		this.mob = mob;	
	}
	public void Amelioration() {
		
		
		
	}
	public void Tour(Mob monstre, Perso joueur) {
		
	
		while(joueur.gethp() > 0 && mob.gethp() > 0) {		
			Scanner scann = new Scanner(System.in);
			System.out.println("1 att, 2 def, 3 recharge");
			int act = scann.nextInt();
			int mobAct = mob.rng();
			AttaqueStrat regen = new Regen();
			if (act == 1) {
				System.out.println("vous attaquez");
				if (mobAct == 1) {
					System.out.println("l'ennemi att");
					joueur.attaque(mob, regen);
				}
				if (mobAct == 2) {
					System.out.println("l'ennemi def");
				}
				if (mobAct == 3) {
					System.out.println("l'ennemi rech");
					mob.recharge();
					joueur.attaque(mob, regen);
					
				}
			}
			if (act == 2) {
				System.out.println("vous défendez");
				if (mobAct == 1) {
					System.out.println("l'ennemi att");
				}
				if (mobAct == 2) {
					System.out.println("l'ennemi def");
				}
				if (mobAct == 3) {
					mob.recharge();
					
					System.out.println("l'ennemi rech");
				}
			}
			if (act == 3) {
				System.out.println("vous rechargez");
				joueur.recharge();
				if (mobAct == 1) {
					System.out.println("l'ennemi att");
					mob.attaque(joueur);
				}
				if (mobAct == 2) {
					System.out.println("l'ennemi def");
				}
				if (mobAct == 3) {
					mob.recharge();
					
				}
			}
			System.out.println("il vous reste " + joueur.gethp() + "hp");
			System.out.println("l'ennemi à" + mob.gethp() + "hp");
			this.tour =+ 1;
		}
			
	}
	public void Boucle(Perso joueur){
		Mob mob = new Mob(30,10,0);
		
		this.Tour(mob, joueur);
		
		if (joueur.gethp() <= 0) {
			System.out.println("t'as die");
			System.out.println(this.score);
			}
		if (mob.gethp() <= 0) {
			System.out.println("un kill");
			this.combat =+ 1;
			this.score =+ 1;
			this.tour = 0;
			
			if (this.combat >= 3) {
				this.palier =+ 1;
				this.combat = 0;
				this.Amelioration();
				}
			
			}
		
	}
	
	
}
