package test;

import java.util.Scanner;

public class Game {
	Player player;
	Mob mob;
	int level = 0;
	int fightNumber = 0;
	int score = 0;
	int turn = 0;
	
	
	public Game(Mob mob, Player player) {
		this.player = player;
		this.mob = mob;	
	}
	
	public void Amelioration() {
		
	}
	
	public void Turn(Mob monster, Player player) {
		
		while(player.getHp() > 0 && mob.getHp() > 0) 
		{		
			Scanner scanner = new Scanner(System.in);
			System.out.println("1 att, 2 def, 3 recharge");
			int action = scanner.nextInt();
			int mobAction = mob.rng();
			AttaqueStrat regen = new Regen();
			
			if (action == 1) {
				System.out.println("vous attaquez");
				if (mobAction == 1) {
					System.out.println("l'ennemi att");
					player.attack(mob, regen);
				}
				if (mobAction == 2) {
					System.out.println("l'ennemi def");
				}
				if (mobAction == 3) {
					System.out.println("l'ennemi rech");
					mob.reload();
					player.attack(mob, regen);
				}
			}
			
			if (action == 2) {
				System.out.println("vous défendez");
				
				if (mobAction == 1) {
					System.out.println("l'ennemi att");
				}
				
				if (mobAction == 2) {
					System.out.println("l'ennemi def");
				}
				
				if (mobAction == 3) {
					mob.reload();
					System.out.println("l'ennemi rech");
				}
			}
			
			if (action == 3) {
				System.out.println("vous rechargez");
				joueur.reload();
				
				if (mobAction == 1) {
					System.out.println("l'ennemi att");
					mob.attack(player);
				}
				
				if (mobAction == 2) {
					System.out.println("l'ennemi def");
				}
				
				if (mobAction == 3) {
					mob.reload();
				}
			}
			System.out.println("il vous reste " + player.getHp() + "hp");
			System.out.println("l'ennemi à" + mob.getHp() + "hp");
			this.turn =+ 1;
		}
			
	}
	
	public void Loop(Player player){
		Mob mob = new Mob(30,10,0);
		
		this.Turn(mob, player);
		
		if (player.getHp() <= 0) {
			System.out.println("t'as die");
			System.out.println(this.score);
			}
		if (mob.getHp() <= 0) {
			System.out.println("un kill");
			this.fight =+ 1;
			this.score =+ 1;
			this.turn = 0;
			
			if (this.fight >= 3) {
				this.level =+ 1;
				this.fight = 0;
				this.Amelioration();
				}
			}
	}
}
